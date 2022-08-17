//Com cabeça

typedef struct pessoa {
    int value;
    struct pessoa *prox;
} Pessoa;

Pessoa *head = malloc(sizeof(Pessoa));
if (head == NULL) {
    return 1;
}
head->value = 1;
head->next = NULL;

void 
insere (int x, celula *p)
{
   celula *nova;
   nova = malloc (sizeof (celula));
   nova->conteudo = x;
   nova->prox = p->prox;
   p->prox = nova;
}

void Remove (celula *top){
    celula *aux;
    aux = top->prox;
    celula *lixo;
    lixo = top->prox;
    top->prox = lixo->prox;
}

void imprime (celula *top) {
   if (top != NULL) {
      printf ("%d\n", top->value);
      imprime (top->prox);
   }
}


}