import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(System.in,System.out);

       /* String[] options = {"Username", "Password"};

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Insert your username and password below:");*/

        StringInputScanner answerString = new StringInputScanner();
        PasswordInputScanner passString = new PasswordInputScanner();


    }
}
