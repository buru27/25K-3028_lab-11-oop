import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        try {
            // Step 1: Input 5 elements
            System.out.println("Enter 5 elements:");
            for (int i = 0; i < 5; i++) {
                list.add(sc.nextLine());
            }

            // Step 2: Create file on Desktop
            String path = System.getProperty("user.home") + "/Desktop/data.txt";
            File file = new File(path);

            // Step 3: Write to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String item : list) {
                bw.write(item);
                bw.newLine();
            }
            bw.close();

            // Step 4: Read from file
            System.out.println("\nReading from file:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // Step 5: Delete file
            if (file.delete()) {
                System.out.println("\nFile deleted successfully.");
            } else {
                System.out.println("File deletion failed.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
