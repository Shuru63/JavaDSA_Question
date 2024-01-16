import java.util.*;
public class largestinarray {
    public static int largest(int arr[]){
        int n= arr.length;
        int largest_key=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(largest_key<arr[i]){
                largest_key=arr[i];
            }
        }
        return largest_key;
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
         
            int arr[] = new int [n];
            System.out.println("enter the Element  of array : ");
            for(int i=0; i<n; i++){
               arr[i]=sc.nextInt();
            }
            int result=largest(arr);
            System.out.println(" Largest  Element  of array : ");
               System.out.print(result);
        }
    }
}
