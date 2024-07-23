import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoreClass {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now "+now);

        System.out.println("Year "+now.getYear());
        System.out.println("Month "+now.getMonth());
        System.out.println("Month "+now.getMonthValue());
        System.out.println("Day of month "+now.getDayOfMonth());
        System.out.println("Day of week"+now.getDayOfWeek());
        System.out.println("Day of year "+ now.getDayOfYear());

        System.out.println("Hour "+now.getHour());
        System.out.println("Minutes "+ now.getMinute());
        System.out.println("Seconds"+now.getSecond());

        System.out.println("Last week "+ now.minusWeeks(1));

        LocalDateTime lastExam = LocalDateTime.of(2024, 4, 28,9,0);
        System.out.println(lastExam);

        String test = "Hello World";
        System.out.println(test.substring(0, 3));

        DateTimeFormatter dateFormat0 = DateTimeFormatter.ofPattern("y");
        System.out.println("Date Format1: "+now.format(dateFormat0));

        DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("EEEE-MMMM/d,y");
        System.out.println("Date Format2 "+ now.format(dateFormat1));

        DateTimeFormatter dateFormat2 = DateTimeFormatter.ofPattern("hh mm ss a");
        System.out.println("Date Format3 " + now.format(dateFormat2));


    }
}
