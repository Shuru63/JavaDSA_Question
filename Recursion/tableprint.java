import java.util.Scanner;

public class tableprint {
    public static void table(int n,int multiplier){
        if (multiplier > 10) {
            return;
        }
        System.out.println(n * multiplier);

        table(n, multiplier + 1);
    }
   public static void main(String arg[]){
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       
       int multiplier=1;
       table(num,multiplier);
  
} 
}
