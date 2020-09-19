#include <stdio.h>

int facto(int n)
{
	if (n == 0)
	{
		return 1;
	}
	else
	{
		return n * facto(n - 1);
	}

}

int main()
{
	int n = 0;

	printf("De quel entier voulez-vous calculer la factorielle ? : ");
	scanf("%i", &n);
	
	printf("%i! = %i\n", n, facto(n));

return 0;
}
