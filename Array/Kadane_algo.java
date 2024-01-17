import java.util.*;
public class Kadane_algo {
    public static int Kadane(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0; i<arr.length; i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
                
            }
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the size of array");
            int size=sc.nextInt();
            System.out.println("enter the array elemnt");
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
             int result =Kadane(arr);
             System.out.println("the maximum Sum of subarray : "+result);
        }
    }
}
