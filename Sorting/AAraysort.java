import java.util.*;

public class AAraysort {
    public static void main(String arg[]){
          Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array ");
       int size=sc.nextInt();
       System.out.println("enter the element of array");
       int arr[]=new int[size];
       for(int i=0; i<size; i++){
         arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       System.out.println("the sorted element is");
       for(int i=0; i<size; i++){
        System.out.println(arr[i]);
       }
    }
}
