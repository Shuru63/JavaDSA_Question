import java.util.Scanner;

public class SelectionSort {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<arr.length; j++){
                 if(arr[minpos]>arr[j]){
                    minpos=j;
                 }
          
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void  main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array ");
       int size=sc.nextInt();
       System.out.println("enter the element of array");
       int arr[]=new int[size];
       for(int i=0; i<size; i++){
         arr[i]=sc.nextInt();
       }
       selection(arr);
       System.out.println("the sorted element is");
       for(int i=0; i<size; i++){
        System.out.println(arr[i]);
       }

    }
}
