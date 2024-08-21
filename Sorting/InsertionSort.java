import java.util.Scanner;

public class InsertionSort {
    public static void insertion(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
               prev--;
            }
       arr[prev+1]=curr;
        }
    }
    public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array ");
       int size=sc.nextInt();
       System.out.println("enter the element of array");
       int arr[]=new int[size];
       for(int i=0; i<size; i++){
         arr[i]=sc.nextInt();
       }
       insertion(arr);
       System.out.println("the sorted element is");
       for(int i=0; i<size; i++){
        System.out.println(arr[i]);
       }
    }
}
