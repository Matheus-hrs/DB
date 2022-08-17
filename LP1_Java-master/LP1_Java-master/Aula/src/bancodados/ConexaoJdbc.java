package bancodados;
/*Importando bibliotecas */

//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


/**

 */

public class ConexaoJdbc {
   
	/* Atributos da classe*/
  	
   Connection con;
   Statement stmt;
   ResultSet rs;
   PreparedStatement ps;

 /*Configura��o do BD */
   
   //bd db4free.net
   String url = "jdbc:mysql://db4free.net:3306/fatec_adriana";
   String user = "fatec_adriana";
   String password = "12345678";
   String driver = "com.mysql.cj.jdbc.Driver";
   
   
//****************************************************************************************/
    
    public void abrirConexao()

    {

        try{

            //Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            
        }catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, "Erro na conex�o com o BD ","ERRO",JOptionPane.ERROR_MESSAGE,null);

        }

    }

	
//******************************************************************/	
	public void createRegistro(String q) throws SQLException {
		
		try {

			abrirConexao();

          //Executa a query de inser��o
         stmt.executeUpdate(q);
         JOptionPane.showMessageDialog(null, "registro inserido");
		}
		finally
		{
			con.close();
		}
	
	}
	
//**************************************************************/	
	public void read (String query) throws SQLException {
		try {

			abrirConexao();
          
          rs = stmt.executeQuery(query);
         
        
          if (rs.next()) {

            System.out.println(rs.getString("RA")+ rs.getString("Nome")+ rs.getString("Sexo")+ rs.getString("Massa")+rs.getString("Altura"));
             	
           
          	JOptionPane.showMessageDialog(null,rs.getString("RA")+ rs.getString("Nome")+ rs.getString("Sexo")+ rs.getString("Massa")+rs.getString("Altura"));
          	
              

          } 
          else {

                   JOptionPane.showMessageDialog(null, "N�o existe registro com este C�digo !");
             
          }
		
		} 
		
		catch (Exception ex) {

	                              JOptionPane.showMessageDialog(null,"erro aqui");

	       }
		finally
		{
			con.close();
		}
			
	
	}

//***********************************************************************************/
	public void update(String query) throws SQLException{
		try {

		  abrirConexao();
         
          stmt.executeUpdate(query);

          JOptionPane.showMessageDialog(null, " Dados atualizados");

      } catch (Exception ex) {

          JOptionPane.showMessageDialog(null, ex);

      }
		finally
		{
			con.close();
		}
		
	}

	
//*************************************************************************/	
	public void delete(String query) throws SQLException {
		try {

		  abrirConexao();
          
           stmt.executeUpdate(query);

          JOptionPane.showMessageDialog(null, "item exclu�do");
          
		
		}
		catch (Exception ex) {

	            JOptionPane.showMessageDialog(null, "erro ao exlcuir");

	        }
		finally
		{
			con.close();
		}
			
	}
	
	
	

}