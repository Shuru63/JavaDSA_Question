import java.util.Scanner;
public class minCharfrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        char result=minchar(str);
        System.out.println("the character which is appeared for the maximum times in the String "+result);
    }
    public static char minchar(String str){
        int freq[]=new int[128];
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        int minfreq=Integer.MAX_VALUE;
        char result=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(freq[ch]<minfreq)
            minfreq=freq[ch];
            result=ch;
        }
        System.out.println("the min frequency"+minfreq);
        return result;
    }
}
