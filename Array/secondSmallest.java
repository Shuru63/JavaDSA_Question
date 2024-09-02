import java.util.Scanner;

public class secondSmallest {
    public static int secondSmall(int arr[]){
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }
    public static void main(String[] args){
         Scanner get = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = get.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");
        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();

        }
        int result = secondSmall(arr);
        System.out.println("the second smallest element of an array : " + result);
    }
}
