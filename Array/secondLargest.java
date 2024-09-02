import java.util.Scanner;

public class secondLargest {
    public static int secondL(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                secondLarge = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] != largest) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String arg[]) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = get.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");
        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();

        }
        int result = secondL(arr);
        System.out.println("the second largest element of an array : " + result);
    }

}
