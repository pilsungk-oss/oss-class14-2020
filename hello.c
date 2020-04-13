#include <stdio.h>

void swap(int* a, int* b)
{
    int temp = *a;
    *a = *b;
    *b = temp;

    return;
}

int main()
{
    printf("hello world!!!\n");

    return 0;
}
