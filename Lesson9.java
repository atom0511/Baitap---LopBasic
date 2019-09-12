package Baitap;

import java.util.Arrays;

public class Lesson9 {

    static int Sum(int[] arr) {//Bai1
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong = tong + arr[i];
        }
        return tong;
    }

    static boolean checkSTN(int a) {//Bai2
        boolean flag = true;
        if (a % 2 == 0) {
            flag = true;
        }
        if (a % 2 == 1) {
            flag = false;
        }
        return flag;
    }

    static String[] SortChar(char[] arr) {//Bai3
        String[] a = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((int) arr[j] < (int) arr[j - 1]) {
                    char x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Bai1
        int[] A = {1, 2, 3, 4, 5};
        int tongA = Sum(A);
        System.out.println(tongA);
        // Bai2
        int a = 8;
        boolean checkA = checkSTN(a);
        System.out.println( checkA);
        // Bai3
        char[] aaa = {'y', 'a', 'c', 'z', 'e', 'd'};
        String[] aaa2 = SortChar(aaa);
        System.out.println(Arrays.toString(aaa));
    }
}
