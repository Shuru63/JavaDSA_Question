import java.util.Scanner;

public class sumofallthenumericcharacters {
     public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int sum=0;
       for(int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        if (ch >= '0' && ch <= '9') {
            sum = sum + (ch - '0'); 
        }
       }
System.out.println(sum);
     }
}
