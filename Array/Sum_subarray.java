import java.util.*;
import java.util.Scanner;

public class Sum_subarray {
    public static int subarray(int arr[]) {
        int maxsum = 0;
        int sum ;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the array size");
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("the maximum sum of sub array :");

            int result = subarray(arr);
            System.out.println(result);
        }
    }
}
