import java.util.Locale;

public class Zad3 {

    public static void main(String[] args) {

        double i = 0;
        while (i <= 3.1)
        {
            System.out.printf(Locale.US,"%.1f, ",i);
            i += 0.1;
        }

        do {
            System.out.printf(Locale.US,"%.1f, ",i);
            i += 0.1;
        } while (i <= 3.1);
    }

}
