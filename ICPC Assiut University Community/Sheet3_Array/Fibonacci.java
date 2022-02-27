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
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        long[] a = new long[55];
        a[1] = 0;
        a[2] = 1;

        for (int i = 3; i < 55; i++) 
               a[i] = a[i - 1] + a[i - 2];
        
        System.out.println(new Long(a[n]));
    }

}
