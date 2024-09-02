import java.util.ArrayList;

public class unionOf2Array {
    public static void union(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int left=0;
        int right=0;
        ArrayList <Integer> newArr=new ArrayList<>();
        // left and right is not less than arr1 and arr2 size
        while(left<n1 || right<n2){
            while(left>0 && left<n1 && arr1[left]==arr1[left-1]){
                left++;
            }
            while(right>0 && right<n2 && arr2[right]== arr2[right-1]){
                right++;
            }

            if(left>=n1){
                newArr.add(arr2[right]);
                right++;
                continue;
            }
            if(right>=n2){
                newArr.add(arr1[left]);
                left++;
                continue;
            }
            if(arr1[left]<arr2[right]){
                newArr.add(arr1[left]);
                left++;
            }
            else if(arr1[left]>arr2[right]){
                newArr.add(arr2[right]);
                right++;
            }
            else{
                newArr.add(arr1[left]);
                left++;
                right++;
            }
        }
    }
    public static void main(String arg[]){
       
    }
}
