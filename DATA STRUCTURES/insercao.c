void inserir(lista **p)
{
    lista *atual, *novo, *anterior;
    int num;
    novo = (lista *) malloc(sizeof(lista));
    atual = *p;
    anterior = NULL;
    novo->valor = num;

    if(atual == NULL){
        novo->prox = NULL;
        *p = novo;
    } 
    
    else{
        
        while(atual != NULL && atual->valor < num){
            anterior = atual;
            atual = atual->prox;
        }

        novo->prox = atual;

        if(anterior == NULL){
            *p = novo;
        } 
        
        else{
            anterior->prox = novo;
        }
    }
}

void 
insere (int x, celula *p)
{
   celula *nova;
   nova = malloc (sizeof (celula));
   nova->conteudo = x;
   nova->prox = p->prox;
   p->prox = nova;
}



#include <stdio.h>
#include <stdlib.h>

typedef struct tLista
{
    int valor;
    struct tLista *prox;

} lista;

void inserir(lista **p)
{
    lista *atual, *novo, *anterior;
    int num;

    novo = (lista *) malloc(sizeof(lista));

    atual = *p;
    anterior = NULL;

    printf("Insira um valor: ");
    scanf("%d", &num);

    novo->valor = num;

    if(atual == NULL){
        novo->prox = NULL;
        *p = novo;
    } else{
        while(atual != NULL && atual->valor < num){
            anterior = atual;
            atual = atual->prox;
        }

        novo->prox = atual;

        if(anterior == NULL){
            *p = novo;
        } else{
            anterior->prox = novo;
        }
    }
}

void mostraLista(lista *p)
{
    while(p != NULL)
    {
        printf("Valor: %d\n", p->valor);
        p = p->prox;
    }
}

int main(void)
{

    lista *inicio = NULL;
    char opcao = 's';

    while( opcao == 's' || opcao == 'S' )
    {
        inserir(&inicio);

        printf("Deseja inserir outro? (S/N)\n");
        scanf(" %c", &opcao);
    }

    mostraLista(inicio);

    return 0;
}
















//https://forum.scriptbrasil.com.br/topic/173946-ordenar-elementos-crescentemente-em-lista-encadeada/