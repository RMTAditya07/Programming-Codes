import java.util.*;
class CircularRotations {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int turn = 4;
        rotate(arr,turn);
    }
   public static void rotate(int arr[],int t){
       for(int i=0;i<t;i++){
           int temp = arr[0];
           for(int j=0;j<arr.length-1;j++){
               arr[j] = arr[j+1];
           }
           arr[arr.length-1 ] =temp;
       }
       for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
   }
}
