import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s= scan.next();
        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        String revWord = sb.toString();

        if(s.equals(revWord)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
