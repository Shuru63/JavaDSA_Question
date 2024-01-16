import java.util.*;
public class subset {
    public static void subsetofarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=0; j<arr.length; j++){
                System.out.print("( "+curr+" , "+arr[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int size =sc.nextInt();
            System.out.println("enter the element of array : " );
            int arr[]= new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
           subsetofarray(arr);
        }
    }
}
