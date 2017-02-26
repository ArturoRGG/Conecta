#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a[10]={2,4,6,8,10,1,3,22,7,13};
	int n=10;
	int i,j,aux[10];
	int sol;
	/* El arreglo es ordenado */ 
	for(i=1;i<n;i++){
		j=i;
		aux[i]=a[i];
		while(j>0 && aux[i]<a[j-1])
		{
			a[j]=a[j-1];
			j--;
		}
		a[j]=aux[i];
		}
	/* Se realiza la sustraccion de los extremos */
		printf("La mayor diferencia es: ");
		printf("%d ",a[9]-a[0]);
		
		
		
	system("PAUSE");
	return 0;
}
