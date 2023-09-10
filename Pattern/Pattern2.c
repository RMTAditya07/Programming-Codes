#include <stdio.h>
int main() {
    int i,j,n;
    int count=0;
    printf("Enter the number of rows :\n");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<=i;j++){
            count++;
            if(j!=0){
                printf("* %d ",count);
            }
            else{
                printf("%d ",count);
            }
        }
        printf("\n");
    }

    return 0;
}
// Enter the number of rows :
// 6
// 1 
// 2 * 3 
// 4 * 5 * 6 
// 7 * 8 * 9 * 10 
// 11 * 12 * 13 * 14 * 15 
// 16 * 17 * 18 * 19 * 20 * 21
