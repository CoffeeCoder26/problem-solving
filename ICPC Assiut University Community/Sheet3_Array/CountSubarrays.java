/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sheet;

import java.util.Scanner;

/**
 *
 * @author Karim Abo Agiza
 */
public class CountSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000 + 5];
        int t = sc.nextInt();
        int n;

        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();
            for (int x = 0; x < n; x++) {
                arr[x] = sc.nextInt();
            }
            int cnt = n;

            for (int k = 0; k < n; k++) {
                for (int j = k + 1; j < n; j++) {
                    if (arr[j] >= arr[j - 1]) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
