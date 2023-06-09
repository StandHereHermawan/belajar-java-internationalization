package arief.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        var language = "in";
        var country = "ID";
        var locale = new Locale(language,country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }

    @Test
    void testNewLocaleUS() {
        var language = "en";
        var country = "US";
        var locale = new Locale(language,country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }
}
