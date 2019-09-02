package Baitap;

import java.util.Scanner;

public class Lesson6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of line and column: ");
        int line = sc.nextInt();
        int column = sc.nextInt();
        int[][] a = new int[line][column];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                String atom = sc.next();
                a[i][j] = Integer.parseInt(atom);
            }
        }
        System.out.println("A array is: ");
        for (int i = 0; i < line; i++) {
            System.out.print("[");
            for (int j = 0; j <= column - 1; j++) {
                System.out.print(a[i][j] + (j < column - 1 ? ", " : "]\n"));
            }
        }
        int[] b = new int[line];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                b[i] = b[i] + a[i][j];
            }
        }
//        System.out.print("B array is: ");
//        System.out.print("[");
//        for (int i = 0; i < line; i++) {
//            System.out.print(b[i]);
//            System.out.print(i < line - 1 ? ", " : "]");
//        }
        System.out.println("");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (j > 0 && b[j] < b[j - 1]) {
                    int[] x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
            }
        }
        System.out.print("The highest array has the largest sum: [");
        for (int i = 0; i < column; i++) {
            System.out.print(i < column - 1 ? a[line-1][i] + ", " : a[line-1][i] + "]");
        }
        System.out.println("");
    }
}
