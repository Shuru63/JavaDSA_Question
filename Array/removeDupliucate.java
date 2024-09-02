import java.util.Scanner;

public class removeDupliucate {
    public static void removeDupli(int arr[]){
        int n= arr.length; 
         int[] newArr = new int[n];
         int j = 0; 
  
         for (int i = 0; i < n - 1; i++) {
             if (arr[i] != arr[i + 1]) {
                 newArr[j++] = arr[i];
             }
             
         }
         newArr[j++] = arr[n - 1];
 
         System.out.println("Array after removing duplicates:");
         for (int i = 0; i < j; i++) {
             System.out.print(newArr[i] + " ");

         }
         System.out.println( " total element in array after remove duplicate : " + j);
    }
    public static void main(String arg[]) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = get.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");

        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();
        }
        removeDupli(arr);
    }
}
