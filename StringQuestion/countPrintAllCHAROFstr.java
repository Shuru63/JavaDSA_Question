import java.util.*;
public class countPrintAllCHAROFstr {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int count=0;
        int withoutspace=0;
        for(int i=0; i<str.length(); i++){
             char ch=str.charAt(i);
             if(ch != ' '){
                withoutspace++;
             }
             count++;
            
             System.out.println(ch);
        }
        System.out.println("Length of the string is: " + count);
        System.out.println("Length of the string witjout space is: " +  withoutspace);
    }
}
