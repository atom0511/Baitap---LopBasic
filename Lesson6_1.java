package Baitap;

import java.util.Scanner;

public class Lesson6_1 { // tổng và tích 2 ma trận 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao do dai ma tran 1 ");
        // Khai báo độ dài mt1
        int hang1 = sc.nextInt();
        int cot1 = sc.nextInt();
        int[][] a = new int[hang1][cot1];

        System.out.println("Nhap vao do dai ma tran 2 ");
        // Khai báo độ dài mt 2
        int hang2 = sc.nextInt();
        int cot2 = sc.nextInt();
        int[][] b = new int[hang2][cot2];
        int[][] c = new int[cot2][hang2];
        int[][] d = new int[hang1][cot2];
        if (cot1 == hang2) {
        System.out.println("Nhap vao cac phan tu cua ma tran 1 theo thu tu tu => và từ trên xuong duoi ");
        for (int i = 0; i < hang1; i++) {
            for (int j = 0; j < cot1; j++) {
                String atom = sc.next();
                a[i][j] = Integer.parseInt(atom);
            }
        }
        System.out.println("Nhap vao cac phan tu cua ma tran 2 theo thu tu tu => và từ trên xuong duoi ");
        for (int i = 0; i < hang2; i++) {
            for (int j = 0; j < cot2; j++) {
                String atom = sc.next();
                b[i][j] = Integer.parseInt(atom);
            }
        }
//        System.out.println("Ma tran 1 la: ");
//        for (int i = 0; i <= hang1 - 1; i++) {
//            System.out.print("[");
//            for (int j = 0; j <= cot1 - 1; j++) {
//                System.out.print(a[i][j] + (j < cot1 - 1 ? ", " : "]\n"));
//            }
//        }
//        System.out.println("Ma tran 2 la: ");
//        for (int i = 0; i <= hang2 - 1; i++) {
//            System.out.print("[");
//            for (int j = 0; j <= cot2 - 1; j++) {
//                System.out.print(b[i][j] + (j < cot2 - 1 ? ", " : "]\n"));
//            }
//        }
       if (hang1 == hang2 && cot1 == cot2) {
//            System.out.println("Tong hai ma tran: ");
//            for (int i = 0; i < hang1; i++) {
//                System.out.print("[");
//                for (int j = 0; j < hang1; j++) {
//                    c[i][j] = a[i][j] + b[i][j];
//                    System.out.print(c[i][j] + (j == hang1 - 1 ? "]\n" : ", "));
//                }
//            }
//        }
        
            int sum = 0;
            for (int i = 0; i < cot2; i++) {
                for (int j = 0; j < hang1; j++) {
                    for (int k = 0; k < cot1; k++) {// hang2 = cot1
                        sum = sum + a[j][k] * b[k][i];
                        d[j][i] = sum;
                    }
                    sum = 0;
                }
            }
            System.out.println("Ma tran tich la: ");
            for (int i = 0; i < hang1; i++) {
                System.out.print("[");
                for (int j = 0; j <= cot2 - 1; j++) {
                    System.out.print(d[i][j] + (j < cot2 - 1 ? ", " : "]\n"));
                }
            }
        } else {
            System.out.println("Khong nhan duoc");
        }
    }
}
