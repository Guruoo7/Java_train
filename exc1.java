import java.io.Console;
public class exc1 {
    public static void main(String[] args) throws NullPointerException{
        Console c = System.console();
        System.out.println("Enter your Password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("your password " + pass);
    }
}
