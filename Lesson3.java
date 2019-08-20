/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson3 {

    public static void main(String[] args) {
        System.out.println("BaiTapSapXep: ");

        Scanner sc = new Scanner(System.in);
        boolean atom = true;
        System.out.print("Nhập số các STN: ");
        int doDai = sc.nextInt();
        int[] a = new int[doDai];
        System.out.println("Nhap các STN: ");
        for (int i = 0; i < doDai; i++) {
            String token = sc.next();
            a[i] = Integer.parseInt(token);

        }
        System.out.println("Thứ tự ban đầu: " + Arrays.toString(a));
        for (int i = 0; i < doDai; i++) {
            for (int j = 0; j < doDai; j++) {
                if (j > 0 && a[j] < a[j - 1]) {
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
            }
        }
        System.out.println("Thứ tự sau sắp xếp: " + Arrays.toString(a));

        System.out.println("");
        System.out.println("BaiTapPhepNhan: ");
        System.out.println("");

        System.out.println("Nhập 2 số ngẫu nhiên dạng abc: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x, y, z;
        int i = 0;
        int j = 0;
        int l = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                for (l = 0; l < 10; l++) {
                    if (n - i * 100 < 100) {
                        x = i;
                        if (n - x * 100 - j * 10 < 10) {
                            y = j;
                            if (n - x * 100 - y * 10 - l == 0) {
                                z = l;
                                if (n - x * 100 - y * 10 - z == 0) {
                                    break;
                                }

                            }
                        }
                    }
                }
            }
        }
        System.out.println("Phép tính nhân tay");
        System.out.println("  " + m);
        System.out.println("x " + n);
        System.out.println("--------------");
        System.out.println("    " + l * m);
        System.out.println("   " + j * m);
        System.out.println("  " + i * m);
        System.out.println("--------------");
        System.out.println("  " + m * n);

    }

}
