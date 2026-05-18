package Q4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Q4 {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        System.out.println(date.format(formatter));
    }
}
