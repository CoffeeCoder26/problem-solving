/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sheet;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Karim Abo Agiza
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int q = sc.nextInt();
        for (int x = 0; x <= q; x++) {
            int v = sc.nextInt();
            int left = 0;
            int right = n - 1;
            int mid;
            boolean isFound = false;
            while (left <= right) {
                mid = (left + right) / 2;

                if (arr[mid] == v) {
                    System.out.println("found");
                    isFound = true;
                    break;
                } else if (arr[mid] > v) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            }
            if (!isFound) {
                System.out.println("not found");
            }

        }

    }

}
