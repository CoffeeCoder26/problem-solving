import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*

        String a = scan.next();
        String b = scan.next();

        int s = a.length()+b.length();
        System.out.println(s);
        System.out.println(a.compareTo(b) > 0? "Yes" :"No");
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1) + " " +b.substring(0,1).toUpperCase()+b.substring(1));

         */
        String a = scan.next();
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();

        System.out.println(a.substring(d1,d2));
    }
}
