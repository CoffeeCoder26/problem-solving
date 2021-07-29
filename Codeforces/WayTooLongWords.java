import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = null;
        int len = input.nextInt();
        for(int i =0; i<=len; i++) {
            str = input.nextLine();
            if (str.length() > 10) {
                    System.out.print(str.charAt(0));
                    System.out.print(str.length() - 2);
                    System.out.println(str.charAt(str.length() - 1));
            } else {
                System.out.println(str);
            }
        }
    }
}
