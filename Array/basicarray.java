import java.util.*;
import java.util.Scanner;

public class basicarray {
    public static void array() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
           
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            } 
            System.out.println("array taking input the element ");
            for (int i = 0; i <n; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void array2() {
        int arr[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {

        array();
        System.out.println("array the initialize the element ");
        array2();
    }
}