import java.util.*;
import java.util.Scanner;

public class arrayreverse {
    public static void reverse(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
        }
        System.out.println("\nenter the sum of array : ");
        System.out.println(sum);
    }

    public static void diffmethod(int arr[]) {
        int last = arr.length - 1;
        int first = 0;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
           

            last--;
            first++;
        }

    }

    public static void main(String args[]) {
        try (Scanner sc=new Scanner(System.in)) {
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter the Element  of array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("print the reverse Element  of array : ");
            reverse(arr);
            System.out.println("print the other method of reverse Element  of array : ");
            diffmethod(arr);
             for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+ " ");
        }
        }
    }
}
