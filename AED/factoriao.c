#include <stdio.h>
#include <math.h>

unsigned int factorial(unsigned int n){
    int i,factorial = 1;

    for(i = 2;i <=n; i++){
        factorial *= i;
    }
    return factorial;
}

int digits(int n){
    int i,digit = n;
    size_t size = floor(log10(n)+1);
    int digits[size];
    for(i = 0; i< size; i++){
        digit = n % (int)pow(10,i+1);
        if(digit > 10){
            while (digit > 10){
                digit %= (int)pow(10,i+1)
            }
            
        }
        digits[i] = n % (int)pow(10,i+1);
    }
    for(i = 0;i <size; i++){
        printf("%d\n",digits[i]);
    }
    return 0;
}

/*unsigned int factoriao(unsigned int n){
    int i,factoriao;
    size_t size = floor(log10(n))+1;
    for(i = size, i <= size;i++){
        factoriao += ;
    }

    return factoriao;
}*/

int main(){
    digits(1234);
    return 0;
}