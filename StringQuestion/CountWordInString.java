import java.util.Scanner;

public class CountWordInString {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int count=0;
        boolean inword=false;
        for(int i=0; i<str.length(); i++){
                 char ch=str.charAt(i);

                 if(ch!=' ' && !inword){
                    count++;
                    inword=true;
                 }
                 else if(ch==' '){
                    inword=false;
                 }
        }
        System.out.println("the total number of word in string : "+ count);
    }
}
