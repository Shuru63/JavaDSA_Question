import java.util.*;
public class smallest {

    public static int smallestarray(int arr[]){
        int n= arr.length;
        int smallest_key=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(smallest_key>arr[i]){
                smallest_key=arr[i];
            }
        }
        return smallest_key;
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
            int result=smallestarray(arr);
            System.out.println(" Largest  Element  of array : ");
               System.out.print(result);
        }
    }
}


