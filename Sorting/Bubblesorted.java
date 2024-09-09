import java.util.*;
import java.util.Scanner;

public class Bubblesorted {
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array to sort:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {  
            arr[i] = sc.nextInt();
        }

        sorting(arr);

        System.out.println("The sorted elements of the array:");
        for (int i = 0; i < size; i++) {  
            System.out.println(arr[i]);
        }

        sc.close(); 
    }
}
