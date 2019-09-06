package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 2 array: ");
        System.out.print("A Length: ");
        int leng1 = sc.nextInt();
        System.out.print("B Length: ");
        int leng2 = sc.nextInt();
        int[] a = new int[leng1];
        int[] b = new int[leng2];
        int leng3 = leng1 + leng2;
        int[] c = new int[leng3];
        System.out.println("Enter the elements of A array: ");
        for (int i = 0; i < leng1; i++) {
            String token = sc.next();
            a[i] = Integer.parseInt(token);
        }
        System.out.println("Enter the elements of B array: ");
        for (int i = 0; i < leng2; i++) {
            String token = sc.next();
            b[i] = Integer.parseInt(token);
        }
        System.out.println("A array is: " + Arrays.toString(a));
        System.out.println("B array is: " + Arrays.toString(b));
        for (int i = 0; i < leng1; i++) {
            for (int j = 0; j < leng1; j++) {
                if (j > 0 && a[j] < a[j - 1]) {
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
            }
        }
        for (int i = 0; i < leng2; i++) {
            for (int j = 0; j < leng2; j++) {
                if (j > 0 && b[j] < b[j - 1]) {
                    int x = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = x;
                }
            }
        }
        System.out.println("A array after sort is: " + Arrays.toString(a));
        System.out.println("B array after sort is: " + Arrays.toString(b));
        for (int i = 0; i < leng3; i++) {
            if (i < leng1) {
                c[i] = a[i];
            }
            if (i - leng1 < leng2 && i >= leng1) {
                c[i] = b[i - leng1];
            }
        }
        for (int i = 0; i < leng3; i++) {
            for (int j = 0; j < leng3; j++) {
                if (j > 0 && c[j] < c[j - 1]) {
                    int x = c[j];
                    c[j] = c[j - 1];
                    c[j - 1] = x;
                }
            }
        }
        System.out.println("C array is: " + Arrays.toString(c));
    }
}
