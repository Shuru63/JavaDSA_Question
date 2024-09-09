import java.util.*;
import java.util.Scanner;

public class binarysearch {
    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("enter the element of array : ");
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the searching key of array : ");
            int key=sc.nextInt();
             int found= binary(arr, key);
            if(found==-1){
         System.out.println("the number is not found");
     }
     else{
        System.out.println("the number is   found");
     }
        }
    }
}
