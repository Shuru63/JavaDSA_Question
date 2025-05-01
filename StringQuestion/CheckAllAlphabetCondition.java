import java.util.Scanner;

public class CheckAllAlphabetCondition {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int upperCaseCount=0;
        int lowerCaseCount=0;
        int SpaceCount=0;
        int SpacialCharacterCount=0;
        int  num=0;
        for(int i=0; i<str.length(); i++){
             char ch=str.charAt(i);
            if (ch==' '){
                SpaceCount++;
            }
            else if(ch>='A' && ch<='Z'){
                upperCaseCount++;
            }
            else if(ch>='a' && ch<='z'){
                lowerCaseCount++;
            }
            else if(ch>='0' && ch<='9'){
                num++;
             }
             else{
                SpacialCharacterCount++;
             }
            
        }
        System.out.println("Length of the Space in string is: " + SpaceCount);
        System.out.println("Length of the  upperCase in string  is: " +  upperCaseCount);
        System.out.println("Length of the lowerCase in string is: " + lowerCaseCount);
        System.out.println("Length of the  number in string  is: " + num);
        System.out.println("Length of the SpacialCharacter in string is: " + SpacialCharacterCount);
    }
}
