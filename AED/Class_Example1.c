#include <stdio.h>

int main(void){
    char multiple[] = "My string";

    char *p = &multiple[0];
    printf("The address of the firts array element : %p\n",p);

    p = multiple;
    printf("The address obtained from the array name : %p\n",multiple);
    return 0;
}