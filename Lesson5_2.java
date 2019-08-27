package Baitap;

import java.util.Scanner;

public class Lesson5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai ma tran ");
        int doDai = sc.nextInt();
        int[][] a = new int[doDai][doDai];

        int doDai2 = doDai * 2 - 1;
        int center = doDai - 1;
        int[][] b = new int[doDai][doDai2];

        System.out.println("Nhap vao cac phan tu cua ma tran theo thu tu tu => và từ trên xuong duoi ");
        for (int i = 0; i < doDai; i++) {
            for (int j = 0; j < doDai; j++) {
                String atom = sc.next();
                a[i][j] = Integer.parseInt(atom);
            }
        }
        if (doDai == 2) {
            int D = a[0][0] * a[1][1] - a[0][1] * a[1][0];
            System.out.println("Định thức của ma trận là: D = " + D);
        } else {
            System.out.println("Ma tran a la: ");
            for (int i = 0; i <= doDai - 1; i++) {
                System.out.print("│");
                for (int j = 0; j <= doDai - 1; j++) {
                    if (j < doDai - 1 && a[i][j] < 10) {
                        System.out.print(a[i][j] + "  ");
                    }
                    if (j < doDai - 1 && a[i][j] >= 10) {
                        System.out.print(a[i][j] + " ");
                    }
                    if (j == doDai - 1) {
                        System.out.print(a[i][j]);
                    }

                    // vẽ phần thừa b
                    for (int k = 1; k < doDai; k++) {
                        b[i][j] = a[i][j];
                        b[i][center + k] = a[i][center + k - 3];
                    }
                }
                System.out.println("│");
            }

            System.out.println("Ma tran b la: ");
            for (int i = 0; i <= doDai - 1; i++) {
                System.out.print("│");
                for (int j = 0; j <= doDai2 - 1; j++) {
                    if (j < doDai2 - 1 && b[i][j] < 10) {
                        System.out.print(b[i][j] + "  ");
                    }
                    if (j < doDai2 - 1 && b[i][j] >= 10) {
                        System.out.print(b[i][j] + " ");
                    }
                    if (j == doDai2 - 1) {
                        System.out.print(b[i][j]);
                    }
                }
                System.out.println("│");
            }

            // tính định thức
            int cc1 = 1;
            int cc2 = 1;
            int cc3 = 1;
            int cc4 = 1;
            int cp1 = 1;
            int cp2 = 1;
            int cp3 = 1;
            int cp4 = 1;
            if (doDai == 3) {
                for (int k = 0; k < doDai; k++) {
                    cc1 = cc1 * b[0 + k][0 + k];
                    cc2 = cc2 * b[0 + k][1 + k];
                    cc3 = cc3 * b[0 + k][2 + k];
                    cp1 = cp1 * b[0 + k][2 - k];
                    cp2 = cp2 * b[0 + k][3 - k];
                    cp3 = cp3 * b[0 + k][4 - k];

                }

                int D = cc1 + cc2 + cc3 - cp1 - cp2 - cp3;
                System.out.println("Định thức của ma trận a là: D = " + D);
            }
            if (doDai == 4) {
                for (int k = 0; k < doDai; k++) {
                    cc1 = cc1 * b[0 + k][0 + k];
                    cc2 = cc2 * b[0 + k][1 + k];
                    cc3 = cc3 * b[0 + k][2 + k];
                    cc4 = cc3 * b[0 + k][3 + k];
                    cp1 = cp1 * b[0 + k][3 - k];
                    cp2 = cp2 * b[0 + k][4 - k];
                    cp3 = cp3 * b[0 + k][5 - k];
                    cp4 = cp4 * b[0 + k][6 - k];
                }
            }
                int D = cc1 + cc2 + cc3 + cc4 - cp1 - cp2 - cp3 - cp4;
            System.out.println("Định thức của ma trận là D = " + D);
        }
    }
}
