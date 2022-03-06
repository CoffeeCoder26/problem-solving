package GeneralSheet;

import java.util.Scanner;

public class KokoAndTheTransformation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sz1 = scan.nextInt();
        int sz2 = scan.nextInt();
        int[]arr1 = new int[sz1];  int[]arr2 = new int[sz2];
        int sum1=0;  int sum2=0;
        for (int i = 0; i<arr1.length; i++){
            arr1[i]=scan.nextInt();
            sum1+=arr1[i];
        }

        for (int i = 0; i<arr2.length; i++){
            arr2[i]=scan.nextInt();
            sum2+=arr2[i];
        }

        if(sum1==sum2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
