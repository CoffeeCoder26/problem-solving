package array.sheet;

import java.util.Scanner;

/**
 *
 * @author Karim Abo Agiza
 */
public class Matrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    s1 += arr[i][j];
                }
                if (i == n - j - 1) {
                    s2 += arr[i][j];
                }
            }
        }
        System.out.println(Math.abs((s1 - s2)));
    }
    
}
