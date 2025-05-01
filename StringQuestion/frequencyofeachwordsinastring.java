import java.util.Scanner;

public class frequencyofeachwordsinastring {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        boolean[] visited = new boolean[words.length];

        System.out.println("Word Frequencies:");
        for (int i = 0; i < words.length; i++) {
            if (visited[i])
                continue;
            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + " : " + count);
        }
    }
}
