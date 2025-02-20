public class LoopbasicEvenOdd {
    public static void evento10(){
        int i=1;
        while(i<=100){
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        }
        System.out.println("complete print all the even i to 100");
    }
    public static void oddto100(){
        int i =1;
        while(i<=100){
            if(i%2!=0){
                System.out.println(i);

            }
            i++;
        }
        System.out.println("complete print all the odd i to 100");
    }
    public static void main(String arg[]){  
        System.out.println("Print all even 1 to 100");
        evento10();
        System.out.println("Print all odd 1 to 100");
        oddto100();
    }
}
