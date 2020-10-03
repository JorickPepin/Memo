#include <stdio.h>

int facto(int n)
{
    return (n == 0) ? 1 : n * facto(n-1);
}

int main()
{
	int n = 0;

	printf("De quel entier voulez-vous calculer la factorielle ? : ");
	scanf("%i", &n);
	
	printf("%i! = %i\n", n, facto(n));

return 0;
}