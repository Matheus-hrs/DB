//Sem cabeça

typedef struct Lista{
    Pessoa *elemento;
    struct Lista *prox;
}Lista;

typedef struct pessoa{
     int i;
}Pessoa;


celula *inserir_inicio(celula **top, Pessoa *p ){
    celula *novo;
    novo = malloc(sizeof(celula));
    novo->elemento= p;
    novo->prox =*topo;
    *topo=novo;}

void Remove (celula *top){
    celula *aux;
    aux = top->prox;
    celula *lixo;
    lixo = top->prox;
    top->prox = lixo->prox;
}

void imprime (celula *top) {
   if (top != NULL) {
      printf ("%d\n", top->elemento);
      imprime (top->prox);
   }
}

