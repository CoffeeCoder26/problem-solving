package GeneralSheet;

import java.util.Scanner;

public class GeorgeandAccommodation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rooms = scan.nextInt();
        int cnt=0;
        for (int i = 1; i <=rooms; i++){
            int p = scan.nextInt();
            int q = scan.nextInt();
            if((q-p)>=2)
                cnt++;
        }
        System.out.println(cnt);
    }
}
