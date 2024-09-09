import java.util.ArrayList;

public class IntersectionOf2array {
    public static void intersection(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int left=0;
        int right=0;
        ArrayList <Integer> newArr=new ArrayList<>();
        while(left<n1 && right<n2){
 // skip the array1 repeated elememt and left index increment
            while(left>0 && left<n1 && arr1[left]==arr1[left-1]){
                left++;
                
            }
             // skip the array2 repeated elememt and right index increment
            while(right>0 && right<n2 && arr2[right]== arr2[right-1]){
                right++;
               
            }
 // array1 element is equal to array2 element then  add array 1 element store in newwarray right increment and left increment
            if (arr1[left] == arr2[right]) {
                newArr.add(arr1[left]);
                left++;
                right++;
            }
              // array1 element is greater then array2 element then  left increment
             else if (arr1[left] < arr2[right]) {
                left++;
            } 
              // array1 element is greater then array2 element then  left increment
            else {
                right++;
            }
        }
        System.out.print(newArr + " ");
    }
    public static void main(String arg[]){
        int arr1[] = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        int arr2[] = { 2, 2, 4, 4, 5, 6, 6, 7, 8 };
        intersection(arr1, arr2);
    }
}
