import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DataAndTIme {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(now);

        System.out.println("Is this year a leap year "+date.isLeapYear());
        System.out.println("Monthe value " +date.getMonthValue());

        LocalDate DoB = LocalDate.of(2004, 10, 24);
        System.out.println(DoB.isEqual(date));
        System.out.println("After " + DoB.isAfter(date));
        System.out.println("Before "+ DoB.isBefore(date));

        LocalDate towWeekAfter = date.plusWeeks(2);
        System.out.println("Two weeks after "+towWeekAfter);

        LocalDate parsed = LocalDate.parse("2023-03-03");
        System.out.println("Parsed "+parsed.getYear());

        Period age = Period.between(DoB, date);
        System.out.println("Age "+ age);
        System.out.println("Age year "+age.getYears());
        System.out.println("Age month "+age.getMonths());
        System.out.println("Age day"+age.getDays());
        
        

    }
}
