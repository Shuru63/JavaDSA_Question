import java.util.*;
public class subarray {
    public static void sub(int arr[]){
      for(int i=0; i<arr.length; i++){
        int start=i;
        for(int j=1; j<arr.length; j++){
            int end =j;
            for(int k=start; k<=end; k++){
                System.out.print(arr[k]+" ,");
            }
            
        }
        System.out.println();
      }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int size = sc.nextInt();
            System.out.println("enter the element of array : ");
            int arr[]=new int[size];
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            sub(arr);
        }
    }
}
