public class MergeSortAray {
    public static void merge(int arr[], int l, int m, int r)
    {
        
         int[] newArr = new int[r - l + 1];
         int x=0;
         int idx1=l;
         int idx2=m+1;
         while(idx1 <=m && idx2<=r){
             if(arr[idx1]<=arr[idx2]){
                 newArr[x++]=arr[idx1++];
             }
             else{
                 newArr[x++]=arr[idx2++];
             }
         }
         while(idx1<=m){
             newArr[x++]=arr[idx1++];
         }
         while(idx2<=r){
             newArr[x++]=arr[idx2++];
         }
         
         for (int i = l, y = 0; i <= r; i++, y++) {
                arr[i] = newArr[y];
                }

    }
   public static void mergeSort(int arr[], int l, int r)

    {  if (l >= r) {
        return;  
    }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
         mergeSort(arr,mid+1,r);
        merge( arr,l,mid,r);
        
    }
    public static void main(String arg[]){
        int arr[]={4 ,1 ,3, 9 ,7};
        int l=0;
        int r=arr.length-1;
        mergeSort(arr, l, r);
        System.out.println("Sorted array:");
        for (int i = 0; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
