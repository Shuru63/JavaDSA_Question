import java.util.Scanner;

public class biggestnumericcharfromthestring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int biggest=biggestnumber(str);
        System.out.println(" the biggest numeric character from the given string : " + biggest);

    }
    public static int biggestnumber(String str){
        int biggest=-1;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9'){
                if((ch-'0')>biggest){
                    biggest=ch-'0';
                }
            }
            
        }
        return biggest;
    }
}
