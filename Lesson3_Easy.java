package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_Easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int doDai = sc.nextInt();
        int[] a = new int[doDai];
        boolean flag2 = true;
        boolean flag3 = true;

        System.out.println("Nhập vào phần tử mảng: ");
        for (int i = 0; i < doDai; i++) {
            String atom = sc.next();
            a[i] = Integer.parseInt(atom);
        }
        System.out.println("Mảng của bạn là: " + Arrays.toString(a));
        int sum1 = 0;
        for (int i = 0; i < doDai; i++) {
            if (i > 0) {
                sum1 = sum1 + a[i];
            } else {
                sum1 = a[0];
            }
        }
        System.out.println("Tổng các phần tử là sum = " + sum1);
        System.out.print("Nếu bạn là coder gõ true, không thì false: ");
        boolean flag1 = sc.nextBoolean();
        if (flag1 == true) {
            System.out.print("Các phần tử ở vị trí chẵn là: ");
            for (int i = 0; i < doDai; i++) {
                if (i % 2 == 0) {
                    System.out.print("a[" + i + "]=" + a[i] + "  ");
                }
            }
            System.out.println("");
            System.out.print("Các phần từ ở vị trí lẻ là: ");
            for (int i = 0; i < doDai; i++) {
                if (i % 2 == 1) {
                    System.out.print("a[" + i + "]=" + a[i] + "  ");
                }
            }
            System.out.println("");
        } else {
            System.out.print("Các phần tử ở vị trí chẵn là: ");
            for (int i = 0; i < doDai; i++) {
                if (i % 2 == 1) {
                    System.out.print("a[" + i + "]=" + a[i] + "  ");
                }
            }
            System.out.println("");
            System.out.print("Các phần từ ở vị trí lẻ là: ");
            for (int i = 0; i < doDai; i++) {
                if (i % 2 == 0) {
                    System.out.print("a[" + i + "]=" + a[i] + "  ");
                }
            }
        }
        System.out.println("");
        System.out.print("Các phần tử chia hết cho 2 là: ");
        for (int i = 0; i < doDai; i++) {
            if (a[i] % 2 == 0) {
                System.out.print("[" + a[i] + "] ");
            }
        }
        System.out.println("");
        System.out.print("Các số chia 5 dư 1 là: ");
        for (int i = 0; i < doDai; i++) {
            if (a[i] % 5 == 1) {
                flag2 = false;
                System.out.print("[" + a[i] + "] ");
            }
        }
        System.out.println("");
        int sum2 = 0;
        for (int i = 0; i < doDai; i++) {
            if (a[i] % 2 == 0 && i > 0) {
                sum2 = sum2 + a[i];
            } else if (a[i] % 2 == 0 && i == 0) {
                sum2 = a[0];
            }
        }
        System.out.println("Tổng các số chẵn là: sum = " + sum2);
    }
}
