import java.util.Scanner;

public class firstnonrepeatingcharacteroftheString {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int result=firstnonrepating(str);
        System.out.println("which index is repeated" + result);

    }
    public static int firstnonrepating(String str){
        int freq[]=new int[128];
        int count=0;
        char crr=' ';
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(freq[ch]==1){
                count=i;
               crr=ch;
               break;
            }
        }
        System.out.println("which is not repeated" + crr);
        return count;
    }
}
