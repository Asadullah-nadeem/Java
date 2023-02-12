package lecture;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static java.lang.System.out;

public class stringClass {
    public static void main(String[] args) {
        String y = "Aman";
        int x= y.length();
        byte[] t = y.getBytes(StandardCharsets.UTF_8);
        out.println(x);
        out.println(t);

        String z = "HERO";
        out.println(z.toUpperCase());
        out.println(z.toLowerCase());
        out.println(z.toLowerCase(Locale.ROOT));
        /*ETC*/
        /*ANS
        *
        * 4
          [B@58372a00
           HERO
           hero
           hero*/
    }
}
