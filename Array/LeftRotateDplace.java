import java.util.Scanner;

public class LeftRotateDplace {
     public static void leftRotateD(int arr[], int idx){
        int n= arr.length;
        int[] temp = new int[idx];
        for(int i=0; i<idx; i++){
            temp[i]=arr[i];
        }
        for(int i=idx; i<n; i++){
            arr[i-idx]=arr[i];
        }
        for(int i = 0; i < idx; i++){
            arr[n - idx + i] = temp[i];
        }
        System.out.println("left Rotated array");

        for (int i = 0; i < n; i++) {
            System.out.print( arr[i]+" " );
        }
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
        System.out.println("enter the index place array");
        int indexplace = get.nextInt();
        leftRotateD(arr,indexplace);
    } 
}
