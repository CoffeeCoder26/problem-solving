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
public class Digits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int nums = in.nextInt();
            if (nums == 0) {
                System.out.println(0);
                continue;
            }
            while (nums != 0) {
                int digit = nums % 10;
                System.out.print(digit + " ");
                nums /= 10;
            }
            System.out.println();

        }
    }

}
