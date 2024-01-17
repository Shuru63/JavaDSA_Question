import java.util.*;
public class optimal_subarary {
    public static int subarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
           prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
              int  end=j;
              if(start==0){
                currsum=prefix[end];
              }else{
                currsum=prefix[end]-prefix[start-1];
              }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String args[]){
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
