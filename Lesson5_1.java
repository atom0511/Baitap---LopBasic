/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang 2 chieu");
        int doDai1 = sc.nextInt();
        int doDai2 = sc.nextInt();
        int[][] a = new int[doDai1][doDai2];
        System.out.println("Nhap vao cac phan tu cua mang theo thu tu tu => và từ trên xuong duoi ");
        for (int i = 0; i < doDai1; i++) {
            for (int j = 0; j < doDai2; j++) {
                String atom = sc.next();
                a[i][j] = Integer.parseInt(atom);
            }
        }
        System.out.println("Mang a la ");

        // in ra phần tử trong mảng
        for (int i = 0; i <= doDai1 - 1; i++) {
            System.out.print("[");
            for (int j = 0; j <= doDai2 - 1; j++) {
                if (j < doDai2 - 1) {
                    System.out.print(a[i][j] + ", ");
                } else if (j == doDai2 - 1) {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println("]");
        }
        //in ra tổng và các số chia hết 3
        int sum = 0;
        boolean flag = true;
        System.out.print("Những phần tử chia hết cho 3 là: ");
        for (int i = 0; i < doDai1; i++) {
            for (int j = 0; j < doDai2; j++) {
                sum = sum + a[i][j];
                if (a[i][j] % 3 == 0) {
                    System.out.print("[" + a[i][j] + "] ");
                    flag = false;
                }
            }
        }
        if (flag = true) {
            System.out.print("Rỗng");
        }
        System.out.println("");
        System.out.println("Tổng các phần tử trong mảng a là: " + sum);

        //in ra các số nguyên tố 
        System.out.println("Các số nguyên tố trong mảng là:");
        for (int i = 0; i < doDai1; i++) {
            for (int j = 0; j < doDai2; j++) {
                int count = 0;
                double can = Math.sqrt(a[i][j]);
                for (int k = 1; k < a[i][j]; k++) {
                    if (a[i][j] % k == 0 && a[i][j] > 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println("[" + a[i][j] + "] ");

                }
            }
        }
    }
}
