import java.util.Scanner;

public class extractFilename {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the full file path: ");
        String filePath = scanner.nextLine();
        
        String fileName = extractFileName(filePath);
        
        System.out.println("File name: " + fileName);
    }

    public static String extractFileName(String path) {
        if (path == null || path.isEmpty()) {
            return "";
        }

        int lastSlashIndex = path.lastIndexOf('/');
        int lastBackslashIndex = path.lastIndexOf('\\');

        int index = Math.max(lastSlashIndex, lastBackslashIndex); 

        
        if (index == -1) {
            return path;
        }

        return path.substring(index + 1);
    }
}
