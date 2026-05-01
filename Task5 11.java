import java.io.*;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Create file
            File file = new File("Confidential.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }

            // Step 2: Take designation input
            System.out.print("Enter designation (Faculty/Student): ");
            String designation = sc.nextLine();

            // Step 3: Set permissions
            if (designation.equalsIgnoreCase("Faculty")) {

                file.setReadable(true);
                file.setWritable(true);
                file.setExecutable(true);

            } else if (designation.equalsIgnoreCase("Student")) {

                file.setReadable(true);
                file.setWritable(false);
                file.setExecutable(false);

            } else {
                System.out.println("Invalid designation.");
                return;
            }

            // Step 4: Show permissions
            System.out.println("\nAccess Rights:");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
