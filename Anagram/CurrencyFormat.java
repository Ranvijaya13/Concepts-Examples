
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        double payment = ran.nextDouble();

        NumberFormat Us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US :" + Us.format(payment));
        System.out.println("India :" + India.format(payment));
        System.out.println("China :" + China.format(payment));
        System.out.println("France :" + France.format(payment));
    }
}
