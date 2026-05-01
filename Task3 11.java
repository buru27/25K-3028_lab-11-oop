import java.util.*;

// Generic Class
class Login<T> {
    private T username;
    private T password;

    public Login(T username, T password) {
        this.username = username;
        this.password = password;
    }

    public void checkLogin(T user, T pass) {
        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password.");
            System.exit(0);
        }
    }
}

// Main Class
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pre-stored credentials
        Login<String> obj = new Login<>("admin", "1234");

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        obj.checkLogin(user, pass);
    }
}
