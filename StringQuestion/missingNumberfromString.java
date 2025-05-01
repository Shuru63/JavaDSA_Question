import java.util.Scanner;

public class missingNumberfromString {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int n = str.length() + 1;  
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            actualSum=actualSum+(ch-'0');
        }
        System.out.println(" the one digit is missing from the given string : " +(expectedSum-actualSum));

    }
}
