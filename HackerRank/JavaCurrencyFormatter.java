import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();

        scan.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String in = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " +us);
        System.out.println("India: "+in);
        System.out.println("China: "+ch);
        System.out.println("France: "+fr);
    }
}
