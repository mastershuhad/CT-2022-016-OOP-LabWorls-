package Q7;
import javax.swing.JFrame;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args){
        JFrame newWindow = new JFrame();

        LocalTime time  = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = time.format(formatter);

        newWindow.setTitle(formattedTime);
        newWindow.setSize(300,400);
        newWindow.setVisible(true);
    }
}
