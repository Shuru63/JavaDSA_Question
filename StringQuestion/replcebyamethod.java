import java.util.Scanner;

public class replcebyamethod {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            boolean onlyDigits = true;
            str = str.replace(' ', '_');
            System.out.println("replace the string:"+str);
            for(int i=0; i<str.length(); i++){
                char ch=str.charAt(i);
                if(ch>='0' && ch<='9'){
                    onlyDigits=false;
                    break;
                }
            }

            if (onlyDigits) {
                System.out.println("The string contains only digits.");
            } else {
                System.out.println("The string does NOT contain only digits.");
            }
     }
}
