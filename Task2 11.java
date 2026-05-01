import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Student info
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student ID: ");
            String id = sc.nextLine();

            // Step 2: Create file
            String path = System.getProperty("user.home") + "/Desktop/" + name + ".txt";
            File file = new File(path);

            // Step 3: Course list
            ArrayList<String> courses = new ArrayList<>();
            int totalCredits = 0;

            // Add initial courses
            courses.add("English");
            courses.add("Calculus");
            courses.add("Physics");
            totalCredits += 9;

            // Step 4: PF condition
            System.out.print("Enter PF Theory marks: ");
            int pfTheory = sc.nextInt();

            System.out.print("Enter PF Lab marks: ");
            int pfLab = sc.nextInt();

            if (pfTheory >= 50 && pfLab >= 50) {
                if (totalCredits + 6 <= 15) {
                    courses.add("OOP Theory");
                    courses.add("OOP Lab");
                    totalCredits += 6;
                } else {
                    System.out.println("Credit limit exceeded.");
                }
            } else {
                System.out.println("Cannot register OOP (PF not cleared).");
            }

            // Step 5: Write to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("Student Name: " + name);
            bw.newLine();
            bw.write("Student ID: " + id);
            bw.newLine();

            bw.write("\nRegistered Courses:");
            bw.newLine();

            for (String course : courses) {
                bw.write(course);
                bw.newLine();
            }

            bw.write("Total Credit Hours: " + totalCredits);
            bw.close();

            // Step 6: Read file
            System.out.println("\nFile Content:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
