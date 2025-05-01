import java.util.Scanner;

public class PalidromNumber{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();
           str=str.toUpperCase();
           int start=0;
           int end=str.length()-1;
           boolean Palidrom=true;
           while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                Palidrom=false;
            }
            start++;
            end--;
           }
           if(Palidrom){
            System.out.println("word is palidrom");
           }else{
            System.out.println("word is not palidrom");
           }
    }
}