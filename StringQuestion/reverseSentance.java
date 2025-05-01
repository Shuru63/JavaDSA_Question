import java.util.Scanner;

public class reverseSentance {
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        
        String[] words=str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }
       
}
}
