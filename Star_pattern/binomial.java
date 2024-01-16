import java.util.*;
public class binomial {
    public static int fact(int num){
        if(num==0){
            return 1;
        }
        else if(num==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
    public static int binomialcoff(int n, int r){
        int Nfact = fact(n);
        int Rfact =fact(r);
        int diff=n-r;
        int diffFact=fact(diff);
         int result = Nfact/(Rfact*diffFact);
         return result;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number of n and r to find binomial coefficient : ");
            int n= sc.nextInt();
            int r =sc.nextInt();

            int result = binomialcoff(n, r);
            System.out.println("the Binomial coefficient of " + n + " C " + r + " : " + result);
            
        }
    }
    
}
