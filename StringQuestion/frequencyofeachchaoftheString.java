import java.util.Scanner;

public class frequencyofeachchaoftheString {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        str = str.toLowerCase(); 
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        boolean[] printed = new boolean[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!printed[ch] && freq[ch]!=1) {
                System.out.println("The frequency of '" + ch + "' is: " + freq[ch]);

                printed[ch] = true;
            }
        }
    }
}
