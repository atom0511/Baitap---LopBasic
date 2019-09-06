package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson7_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int leng = sc.nextInt();
        int[] a = new int[leng];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < leng; i++) {
            String token = sc.next();
            a[i] = Integer.parseInt(token);
        }
        System.out.println("A array is: " + Arrays.toString(a));
        for (int i = 0; i < leng; i++) {
            System.out.println((i + 1) + " sort times: ");
            boolean flag = true;
            for (int j = 0; j < leng; j++) {
                if (j > 0 && a[j] < a[j - 1]) {
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                    System.out.println((j - 1) + " and " + j);
                    flag = false;
                }
                if (j == leng - 1 && flag == true) {
                    System.out.println("empty");
                }
            }
        }
        System.out.println("A array after sort is: " + Arrays.toString(a));
    }
}
