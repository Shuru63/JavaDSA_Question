import java.util.*;
public class BuyStock {
    public static int buysell(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<arr.length; i++){
            if(buyprice<arr[i]){
                  int price= arr[i]-buyprice;
            maxprofit=Math.max(buyprice,price);
            }
          else{
            buyprice=arr[i];
          }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int size=sc.nextInt();
            System.out.println("Enter the elment of array : ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();

            }
           int result=buysell(arr);
           System.out.println("maximum profit in Stock : " + result);
    }
}
}
