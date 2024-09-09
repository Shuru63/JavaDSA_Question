import java.util.Scanner;
public class missingNthNumber {
    public static int missingno(int arr[]){
        int n=arr.length;
        int nlength=n+1;
        int total= nlength*(nlength+1)/2;
        System.out.println(total);
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        int miss=total-sum;
        return miss;
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
            System.out.println("missing  the element in array : " );
          int result= missingno(arr);
          System.out.println(result);
    }
}
