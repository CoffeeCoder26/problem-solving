import java.time.LocalDate;
import java.util.Locale;

public class DateAndTime {
    public static String getDay(String day, String month, String year){

        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        LocalDate  localDate=LocalDate.of(y,m,d);
        return  localDate.getDayOfWeek().name();

    }
}
