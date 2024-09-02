import java.util.Scanner;

public class checkRepeatedElementInArray {
    public static boolean repeatedElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = get.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element of array");

        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();
        }
     boolean result = repeatedElement(arr);
    if(result)
    {
        System.out.println("There are repeated elements in the array.");
    }else
    {
        System.out.println("There are no repeated elements in the array.");
    }
    
    }

  

}
