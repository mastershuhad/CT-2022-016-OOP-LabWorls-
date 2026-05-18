package Q6;
import javax.swing.JFrame;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Frame Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Frame Width: ");
        int W =scanner.nextInt();
        System.out.println("Enter Frame Height: ");
        int H = scanner.nextInt();
        JFrame newWindow = new JFrame();
        newWindow.setSize(W, H);
        newWindow.setVisible(true);
    }
}
