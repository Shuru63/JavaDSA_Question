import java.util.Scanner;

public class characterofStringexactlyonce {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String newstring = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                newstring += ch;
            }
        }
        System.out.println("all the character of the String exactly once." + newstring);
    }
}
