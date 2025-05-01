import java.util.Scanner;

public class checkfreqofnumber {
    public static boolean reprequency(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean result=reprequency(str1, str2);
           System.out.println(" the biggest numeric character from the given string : " + result);

    }
}
