/* 
 * File:   main.cpp
 * Author: adrianferialopez
 *
 * Created on 18 de febrero de 2015, 23:03
 */

#include <cstdlib>
#include "funciones.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {

    int edad;
    char sexo;
    float hemo, minimo, maximo;
    
    printf("Diagnostico de Anemia\n");
    printf("---------------------\n");
            
    do{
        printf("Introduce la edad:\n");
        fflush(stdin);
        scanf("%d", &edad);
        
    }while(edad<1 || edad>100);
    
    do{
        printf("Introduce el sexo[h/m]:\n");
        fflush(stdin);
        scanf("%c", &sexo);
    }while(sexo!= "h" || sexo!="m");
    
    do{
        printf("Introduce el nuvel de hemoglobina\n");
        fflush(stdin);
        scanf("%f", &hemo);
    }while(hemo<1);
    
    if(tienesAnemia(edad,sexo,hemo,&minimo,&maximo) == true)
    {
        printf("El analisis ha dado positivo en anemia..\n");
    }else{
        printf("El analisis ha dado negativo en anemia..\n");
    }
    
    printf("Su nivel maximo es %2f y su minimo es %2f", minimo,maximo);
    
    fflush(stdin);
    getchar();
    return 0;
        
}

