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
public class CheckCode {

    public static void main(String[] args) {
        int[] arr = new int[10000 + 5];

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        boolean x = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == a) {
                if (s.charAt(i) != '-') {
                    System.err.println("No");
                    x = false;
                    break;
                }
            } else {
                if (!Character.isDigit(s.charAt(i))) {
                    System.err.println("No");
                    x = false;
                    break;
                }
            }
        }
        
        if(x)
            System.out.println("Yes");

    }

}
