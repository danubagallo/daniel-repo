import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Compulsory - works for every prompt
        Prompt prompt = new Prompt(System.in, System.out);

        Map<String, String> accounts = new HashMap<>();
        accounts.put("Daniel", "batata");

        while (true) {
            //Menu
            String[] options = {"Create new account", "Log-in"};
            MenuInputScanner scanner = new MenuInputScanner(options);
            scanner.setMessage("Please login to your account");
            int answerMenu = prompt.getUserInput(scanner);
            System.out.println("You chose to " + options[answerMenu - 1] + ".");

            if (answerMenu == 1) {
                //Creating new account
                StringInputScanner username = new StringInputScanner();
                username.setMessage("New username: ");
                PasswordInputScanner password = new PasswordInputScanner();
                password.setMessage("Create your password: ");
                String name = prompt.getUserInput(username);
                String pw = prompt.getUserInput(password);

                if (accounts.containsKey(name)) {
                    System.out.println("Username already in use. Please choose a different username.");
                } else {
                    accounts.put(name, pw);
                }
            }

            if (answerMenu == 2) {
                //Login
                StringInputScanner username = new StringInputScanner();
                username.setMessage("Username: ");
                PasswordInputScanner password = new PasswordInputScanner();
                password.setMessage("Password: ");
                String name = prompt.getUserInput(username);
                String pw = prompt.getUserInput(password);

                if (accounts.containsKey(name) && (accounts.get(name).equals(pw))) {
                    System.out.println("Login Successful! Welcome back, " + name);
                } else {
                    System.out.println("Incorrect Username or Password. Please try again.");
                }
            }
        }
    }
}
