// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int limit = 15;
    fibonacci(limit);
    return 0;
}
int fibonacci(int n){
    int f1=0,f2=1,next;
    printf("\n %d",f1);
    for(int i=1;i<=n;i++){
        printf("\n %d",f2);
        next= f1 + f2;
        f1 = f2;
        f2 = next;
    }
}
