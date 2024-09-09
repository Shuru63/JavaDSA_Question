import java.util.Scanner;
public class maximimCons_1s {
    public static int  maximum(int arr[]){
    int n= arr.length;
    int count=0;
    int max1=0;
    for(int i=0; i<n; i++){
        if(arr[i]==1){
          count++;
          max1=Math.max(max1,count);
        }
        else{
            count=0;
        }
    }
    return max1;

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size =sc.nextInt();
        System.out.println("enter the element of array : " );
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        } 
        int result= maximum(arr);
        System.out.println("maximum consecutive 1's  : " +result );
    

    }
}
