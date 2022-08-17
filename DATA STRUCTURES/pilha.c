//pilha

//https://www.ufsm.br/pet/sistemas-de-informacao/2020/04/01/entendendo-listas-pilhas-e-filas/

typedef struct Lista{
    int info;
    struct Lista *prox;
}Lista;

typedef struct Lista lista;

struct Pilha{
    lista *topo;
}

typedef struct Pilha pilha;

Pilha *cria (void){
     pilha *p = malloc(sizeof(Pilha));
     p->topo = NULL;
     return p;
}


int checklista ( struct Pilha *p ){

   if( p-> topo == NULL )

      return 1;   // Vazia

   else(p->topo != NULL)

      return 0;   // Existe ao menos um

}


void empilhar ( struct Pilha *p, float l){

	p->topo++;
	p->titulo [p->topo] = v;

}

float desempilhar ( struct Pilha *p ){

       if(p->topo == p->livro - 1)

             float aux = p->titulo [p->topo];
             p->topo--;
             return aux;

        else( p-> topo == -1 )

        return 1;   // Vazia
  
}



