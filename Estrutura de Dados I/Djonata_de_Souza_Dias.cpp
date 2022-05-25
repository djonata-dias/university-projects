// Bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define tamanho 5

// Estrutura do Prato
typedef struct tprato {
    char cor[15];
} tprato;

// Estrutura da Pilha
typedef struct tpilha {
	char nome[15];
    struct tprato pratos[tamanho];
    int ini;
    int topo;
} tpilha;


int mostrar_pilha(tpilha pilha);
int empilhar(tpilha *pilha, tprato *prato);
int trocar_pilha(tpilha *pilha1, tpilha *pilha2);


int main() {
    struct tpilha pilha1;
    struct tpilha pilha2;
    struct tprato prato1;
    struct tprato prato2;
    struct tprato prato3;
    struct tprato prato4;
    struct tprato prato5;

    pilha1.topo = 0;
    pilha1.ini = 0;
    strncpy(pilha1.nome, "Pilha 1", sizeof(pilha1.nome));

    pilha2.topo = 0;
    pilha2.ini = 0;
    strncpy(pilha2.nome, "Pilha 2", sizeof(pilha2.nome));

    strncpy(prato1.cor, "Vermelho", sizeof(prato1.cor));
    strncpy(prato2.cor, "Verde", sizeof(prato2.cor));
    strncpy(prato3.cor, "Azul", sizeof(prato3.cor));
    strncpy(prato4.cor, "Branco", sizeof(prato4.cor));
    strncpy(prato5.cor, "Laranja", sizeof(prato5.cor));

    empilhar(&pilha1, &prato1);
    empilhar(&pilha1, &prato2);
    empilhar(&pilha1, &prato3);
    empilhar(&pilha1, &prato4);
    empilhar(&pilha1, &prato5);

    mostrar_pilha(pilha1);
	trocar_pilha(&pilha1, &pilha2);
    mostrar_pilha(pilha2);
	system("pause");
    return 0;
}

// Função para mostrar a pilha
int mostrar_pilha(tpilha pilha) {
    printf("\n -----%s------ \n", pilha.nome);
    
    if(pilha.topo == pilha.ini) {
        printf("Pilha vazia");

        return -1;
    }

    printf("\n[\n");
    for (int i = 0; i < pilha.topo; i++){
        printf("Prato %s, \n", pilha.pratos[i].cor);
    }
    printf("]\n");

    return 0;
}

// Função para empilhar prato
int empilhar(tpilha *pilha, tprato *prato) {
    if (pilha->topo == tamanho){
        printf("Pilha cheia.\n");
        return -1;
    } else {
        pilha->pratos[pilha->topo] = *prato;
        pilha->topo++;
    }

    return 0;
}

// Função para trocar os pratos entre duas pilhas
int trocar_pilha(tpilha *pilha1, tpilha *pilha2) {
	if (pilha1->topo == pilha1->ini) {
        printf("Pilha 1 vazia.\n");

        return -1;
    } else if (pilha2->topo == tamanho) {
        printf("Pilha 2 cheia.\n");
	} else {
	   for (int i = pilha1->topo; i > pilha1->ini; i--){
        pilha1->topo--;
        pilha2->pratos[pilha2->topo] = pilha1->pratos[pilha1->topo];
        pilha2->topo++;
        }
    }

    return 0;
}
