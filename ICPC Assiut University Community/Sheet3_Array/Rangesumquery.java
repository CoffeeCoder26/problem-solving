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
public class Rangesumquery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                s += arr[j];
            }
        }
        System.out.println(s);
    }

}
