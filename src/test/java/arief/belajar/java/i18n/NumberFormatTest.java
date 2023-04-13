package arief.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatUS() {
        var US = new Locale("en","US");
        var numberFormat = NumberFormat.getInstance(US);
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseUS() {
        var US = new Locale("en","US");
        var numberFormat = NumberFormat.getInstance(US);

        try {
            var result = numberFormat.parse("10,000,000.255").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }
}
