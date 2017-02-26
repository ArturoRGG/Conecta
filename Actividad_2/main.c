#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int x[10]; 
	int i,j,a; 
	int r;
/* El usuario ingresa los numeros del arreglo */ 
	for (i=0; i <10; i=i+1) 
	{ 
		printf("De valor de x[%d]:", i+1); 
		scanf("%d",&x[i]); 
	} 
/* El arreglo se ordena de menor a mayor */ 
	for (i=0; i <10; i=i+1) 
	for (j=0; j <10; j=j+1) 
	if ( x[i] < x[j] ) 
	{ 
		a= x[i]; 
		x[i]=x[j]; 
		x[j]=a; 
	} 
/* Se muestra el archivo ordenado */ 
	for(i=0; i <10; i=i+1) 
	printf("%3d", x[i]); 
/* Se realiza la sustraccion y se muestra el resultado */
	r = x[9]-x[0];
	printf("\n La mayor diferencia es: ");
	printf("%d",r);
	return 0;
}
