
package array.sheet;

import java.util.Scanner;

/**
 *
 * @author Karim Abo Agiza
 */
public class MaxSubarray {

    public static void main(String[] args) {
        int[] arr = new int[10000 + 5];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int mx = arr[i];
                    for (int k = i; k < j; k++) {
                        if (arr[k] > mx) 
                            mx = arr[k];
                    }
                    System.out.print(mx + " ");
                }
            }
            System.out.println();

        }
    }

}
