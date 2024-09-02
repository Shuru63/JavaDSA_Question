import java.util.Scanner;

public class leftRotateArray {
    public static void leftRotate(int arr[]){
        int n= arr.length;
        int temp= arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
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
        leftRotate(arr);
    } 
}
