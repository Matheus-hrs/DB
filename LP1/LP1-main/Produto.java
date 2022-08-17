/**
 * 
 */
import java.util.Scanner;

/**
 * @author Matheus Henrique Ribeiro Silva
 *
 */
public class Produto {
	
	//atribuos
	
	private String Nome;
	private int preco;
	private String Parcelamento;

	//metodos de acesso

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getParcelamento() {
		return Parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		Parcelamento = parcelamento;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	private boolean disponivel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite uma avaliação");
            num = ent.nextDouble(); // usuario digita um número
            
            if(num >= 0){ // se o número digitado for MAIOR que zero, executa a conta
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
                cont++; // conta quantas vezes o usuário digitou um número
            }
        } while(num >= 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente
        
        System.out.println("Total da soma das avaliações " + soma); // soma
        System.out.println("A quantidade de avaliações digitadas foi " + cont); // quantidade
        System.out.println("A média é " + soma / cont); // média
    }
	
}


