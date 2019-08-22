/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_Hard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDai = 9999 * 9999;
        int[] a = new int[doDai];
        boolean flag = true;
        int count = 0;
        int num;
        System.out.println("Nhập các số bất kì: ");
        while (flag == true) {
            for (int i = 0; i < doDai; i++) {
                String token = sc.next();
                a[i] = Integer.parseInt(token);
                num = a[i];

                if (num == -1) {
                    flag = false;
                    break;
                }
                count++;
            }
        }
        System.out.print("Các số được nhập vào là: ");
        for (int i = 0; i < doDai; i++) {
            if (i < count) {
                System.out.print(a[i] + ", ");
            } 
            if (i == count){
                System.out.print(a[i]);
                System.out.println("");
            }
        }
    }
}
