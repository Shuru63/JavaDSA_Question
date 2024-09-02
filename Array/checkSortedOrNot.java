import java.util.Scanner;

public class checkSortedOrNot {
    public static boolean sortOrNot(int arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]>=arr[i-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
public static void main(String argp[]){
    Scanner get=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=get.nextInt();
    System.out.println("enter the element of array");
    int arr[]=new int[size];
    for(int i=0; i<size; i++){
     arr[i]=get.nextInt();
    }
    boolean result = sortOrNot(arr);
    System.out.println(result);
    if (result) {
        System.out.println("The array is sorted.");
    } else {
        System.out.println("The array is not sorted.");
    }
}     
}
