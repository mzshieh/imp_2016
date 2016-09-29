#include <stdio.h>

void factorial(int n)
{
    if (n == 0)
    {
        printf("move 1 step\n");
        printf("rotate 1 degree\n");
    }
    else
    {
        for(int i = 0; i < n; i++)
        {
            factorial(n-1);
        }
    }
}

int main()
{
    factorial(3);
    return 0;
}