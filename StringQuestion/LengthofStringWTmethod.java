import java.util.*;
public class LengthofStringWTmethod{
    public static void main(String arg[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int count=0;
      try {
        while (true) {
            str.charAt(count); 
            count++;
        }
    } catch (IndexOutOfBoundsException e) {
        
    }
    
    System.out.println("Length of the string is: " + count);
    }
}