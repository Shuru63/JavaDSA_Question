import java.util.Scanner;

public class wordswhichhasevennumberofcharacters {
     public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        
        String[] words=str.split(" ");
        for (int i =0; i< words.length; i++) {
            int count=0;
            String word=words[i];
            for (int j =0; j< word.length(); j++) {
                count++;
            }
            if(count%2==0){
                System.out.print(words[i]+" ");
            }
        }
       
}
}
