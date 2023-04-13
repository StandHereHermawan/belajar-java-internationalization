package arief.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatUnitedStates() {
        var pattern = "EEEE dd MMMM yyyy";
        var US = new Locale("en","US");
        var dateFormat = new SimpleDateFormat(pattern,US);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var US = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, US);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseUnitedStates() {
        var pattern = "EEEE dd MMMM yyyy";
        var US = new Locale("id","ID");
        var dateFormat = new SimpleDateFormat(pattern,US);

        try {
            var date = dateFormat.parse("Kamis 13 April 2023");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : "+ e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        var pattern = "EEEE dd MMMM yyyy";
        var US = new Locale("ja","JP");
        var dateFormat = new SimpleDateFormat(pattern,US);

        try {
            var date = dateFormat.parse("木曜日 13 4月 2023");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : "+ e.getMessage());
        }
    }
}
