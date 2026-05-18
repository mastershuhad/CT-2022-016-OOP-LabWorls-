package Q5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Q5 {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMM d, yyyy");
        System.out.println(date.format(formatter));
    }
}
