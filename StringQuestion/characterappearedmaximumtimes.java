import java.util.Scanner;

public class characterappearedmaximumtimes {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        char repeString= ' ';
        int max=Integer.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            int count=0;
            char ch=str.charAt(i);
            for(int j=0; j<str.length(); j++){
                  if(ch==str.charAt(j)){
                    count++;
                  }
            }
            if(count > max){
                max=count;
                repeString=ch;
            }
        }
        System.out.println("the character "+ repeString+" is appeared for the maximum times "+max);
    }
}
