package Q2;
import java.util.Scanner;
import javax.swing.JFrame;

public class Q2 {
    static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fisrtname = scanner.next();
        System.out.println("Enter your last name: ");
        String lastname = scanner.next();

        JFrame frame = new JFrame(fisrtname + " " + lastname);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
