import java.util.*;
import java.util.Scanner;
public class moveZeroAtEnd {
    public static void zeroEnd(int arr[]){
        int n=arr.length;
        int idx=0;
        for(int i=0;i<n; i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
        while(idx<n){
            arr[idx]=0;
            idx++;
        }
    }
    public static void main(String arg[]){
  
    }
}
