/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

import java.util.Scanner;

/**
 *
 * @author Karim Abo Agiza
 */
public class SomeSums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sumDigits = 0;
            int t = i;

            while (t != 0) {
                sumDigits += t % 10;
                t /= 10;
            }

            if (sumDigits >= a && sumDigits <= b) {
                sum += i;
            }
        }
        System.out.println(sum);

    }

}
