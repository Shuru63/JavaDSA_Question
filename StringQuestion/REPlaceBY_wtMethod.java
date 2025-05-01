import java.util.Scanner;

public class REPlaceBY_wtMethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            
            StringBuilder modifiedStr = new StringBuilder();
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                
                if (ch == ' ') {
                    modifiedStr.append('_'); 
                } else {
                    modifiedStr.append(ch); 
                }
            }
            
            System.out.println("Modified string: " + modifiedStr.toString());
        }
}
