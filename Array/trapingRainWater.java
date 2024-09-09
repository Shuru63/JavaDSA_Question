import java.util.*;
import java.util.Scanner;
public class trapingRainWater {
    public static int rainwater(int arr[]){
        // left maximum element axuilary array
         int leftmax[] = new int[arr.length];
         leftmax[0]=arr[0];
         for(int i=1; i<arr.length; i++){
             leftmax[i]=Math.max(arr[i],leftmax[i-1]);
             
         }
        
        System.out.println();
         int trapewater=0;
         // right maximum element axuilary array
         int rightmax[]=new int[arr.length];
         rightmax[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2; i>=0; i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
         }
       
        /*calculation of traping water minimum of building height (waterlevel) 
          
         */ 
         for(int i=0; i<arr.length; i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapewater=trapewater+waterlevel-arr[i];
         }
         return trapewater;
    }
    public static void main(String arg[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the size of array : ");
            int size=sc.nextInt();
            System.out.println("Enter the elment of array : ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();

            }
           
            int result=rainwater(arr);
            System.out.println("the maximum of trap water by building : " + result);
        }
    }
}
