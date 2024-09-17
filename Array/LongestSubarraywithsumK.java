public class LongestSubarraywithsumK{
    public static int longest(int arr[],int key){
     int n=arr.length;
     int size=0;
     for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            int curr=0;
            for(int k=i; k<j; k++){
                curr=curr+arr[i];
                if(curr==k){
                   size=Math.max(size,j-i+1);
                }
            }
        }
     }
     return size;
    }
public static void main(String arg[]){
    int arr[]={1,2,3,1,1,1,1,4,2,3};
    int key=6;
    int result=longest(arr,key);
     System.out.println(result);
}
}