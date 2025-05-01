import java.util.Scanner;

public class LargestWordinSentance {
      public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int largestword=Integer.MIN_VALUE;
        String largest=" ";
        String[] words=str.split(" ");
        for (int i =0; i< words.length; i++) {
            int count=0;
            String word=words[i];
            for (int j =0; j< word.length(); j++) {
                count++;
            }
            if(count>largestword){
                largestword=count;
                largest=words[i];
            }
            
        }
        System.out.print(largest);
}
}
