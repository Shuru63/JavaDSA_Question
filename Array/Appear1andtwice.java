public class Appear1andtwice {
    public static int OnceAndTwice(int arr[]){
      int num= arr.length;
      
      for(int i=0; i<num; i++){
        int n=arr[i];
        int count=0;
        for(int j=0; j<num; j++){
            if(arr[j]==n){
                 count++;
            }
        }
        
        
        if(count==1){
            return n;
        }
      }
      
      return 0;
    }

    public static int UsingXor(int arr[]){
        int num= arr.length;
         int xor=0;
      for(int i=0; i<num; i++){
             xor=xor^arr[i];
      }
return xor;
    }
  public static void main(String arg[]){
    int arr[]={1,1,2,2,3,3,4,4,6,5,5};
    int result=OnceAndTwice(arr);
     System.out.println("The unique number is using Brute force: " + result);
  
    System.out.println("The unique number is using Xor approch: " + UsingXor(arr));
  }  
}
