import java.util.ArrayList;
import java.util.*;

public class unionOf2Array {
    public static void union(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int left = 0;
        int right = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        // traverse all array left and right is less than array 1 and array 2
        while (left < n1 || right < n2) {
            // skip the array1 repeated elememt and left index increment
            while (left > 0 && left < n1 && arr1[left] == arr1[left - 1]) {
                left++;
            }
            // skip the array2 repeated elememt and right index increment
            while (right > 0 && right < n2 && arr2[right] == arr2[right - 1]) {
                right++;
            }
            // if array 1 is finish and index is greater than and equal to array 1 length then
            // add array2 element store in newwarray right increment
            if (left >= n1) {
                newArr.add(arr2[right]);
                right++;
                continue;
            }
            // if array 2 is finish and index is greater than and equal to array2 length then
            // add array1 element store in newwarray left increment
            if (right >= n2) {
                newArr.add(arr1[left]);
                left++;
                continue;
            }
        //    comparision 
        // array2 element is greater then array1 element then  add array1 element store in newwarray left increment
            if (arr1[left] < arr2[right]) {
                newArr.add(arr1[left]);
                left++;
            }
             // array1 element is greater then array2 element then  add array2 element store in newwarray right increment
             else if (arr1[left] > arr2[right]) {
                newArr.add(arr2[right]);
                right++;
            }
            // array1 element is equal to array2 element then  add array2 and  array 1 element store in newwarray right increment and left increment
             else {
                newArr.add(arr1[left]);
                left++;
                right++;
            }
        }
        System.out.print(newArr + " ");
    }

    public static void main(String arg[]) {
        int arr1[] = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        int arr2[] = { 2, 2, 4, 4, 5, 6, 6, 7, 8 };
        union(arr1, arr2);

    }
}
