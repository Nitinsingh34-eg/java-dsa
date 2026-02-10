import java.util.*;


public class InsertionSort { 
    public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
  public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};

<<<<<<< HEAD

       
=======
>>>>>>> f69b9482f042605c706c981487da1984d19b9e7f
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current) {
<<<<<<< HEAD
                   
=======
>>>>>>> f69b9482f042605c706c981487da1984d19b9e7f
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
       printArray(arr);
   }
}


    

