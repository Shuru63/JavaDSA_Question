import java.util.*;

public class linearseach {
    public static int linear(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
         
            int arr[] = new int [n];
            System.out.println("enter the Element  of array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
               System.out.println("enter the searching element of array : ");
            int key = sc.nextInt();
           int found= linear(arr, key);
             if(found==-1){
          System.out.println("the number is not found");
      }
      else{
         System.out.println("the number is   found");
         
          
      }
        }
    }
}
