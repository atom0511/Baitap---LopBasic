package Baitap;

import java.util.Scanner;

public class Lesson6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of A array: ");
        int leng1 = sc.nextInt();
        int[] a = new int[leng1];
        System.out.println("Enter the element of A array: ");
        for (int i = 0; i < leng1; i++) {
            String token = sc.next();
            a[i] = Integer.parseInt(token);
        }
        System.out.print("A array is: ");
        System.out.print("[");
        for (int i = 0; i < leng1; i++) {
            System.out.print(a[i]);
            System.out.print(i < leng1 - 1 ? ", " : "]\n");
        }
        
        // The odd element change to -1 
        int[] b = new int[leng1];
        int[] c = new int[leng1];
        int[] d = new int[leng1];
        int[] e = new int[leng1];
        for (int i = 0; i < leng1; i++) {
            b[i] = a[i];
            c[i] = a[i];
            d[i] = a[i];
            e[i] = a[i];
            if (b[i] % 2 == 1) {
                b[i] = -1;
            }
        }
        System.out.print("A array after the first change is: ");
        System.out.print("[");
        for (int i = 0; i < leng1; i++) {
            System.out.print(b[i]);
            System.out.print(i < leng1 - 1 ? ", " : "]\n");
        }

        //Print the largest element and Convert the smallest element to -1 
        for (int i = 0; i < leng1; i++) { //sort element of array C
            for (int j = 0; j < leng1; j++) {
                if (j > 0 && c[j] < c[j - 1]) {
                    int x = c[j];
                    c[j] = c[j - 1];
                    c[j - 1] = x;
                }
            }
        }
        System.out.println("The largest element: " + c[leng1 - 1]);
        for (int i = 0; i < leng1; i++) {
            if (d[i] == c[0]) { // Convert the smallest element to -1
                d[i] = -1;
            }
        }
        System.out.print("A array after the second change is: ");
        System.out.print("[");
        for (int i = 0; i < leng1; i++) {
            System.out.print(d[i]);
            System.out.print(i < leng1 - 1 ? ", " : "]\n");
        }

        //Enter X number
        System.out.print("Enter a natural X number: ");
        int x = sc.nextInt();
        System.out.print("Elements less than X: ");
        for (int i = 0; i < leng1; i++) {
            if (c[i] < x) {
                System.out.print(c[i] + " ");
            }
        }
        for (int i = 0; i < leng1; i++) { //sort element of array C
            for (int j = 0; j < leng1; j++) {
                if (j > 0 && Math.abs(e[j] - x) < Math.abs(e[j - 1] - x)) {
                    int atom = e[j];
                    e[j] = e[j - 1];
                    e[j - 1] = atom;
                }
            }
        }
        System.out.println("");
        System.out.print("The elements that are closest to X: ");
        for (int i = 0; i < leng1; i++) {
            if (i < leng1 && Math.abs(e[i] - x) == Math.abs(e[0] - x)) {
                System.out.print(e[i] + " ");
            }
        }
        System.out.println("");

        //Consider the symmetry
        boolean flag = true;

        for (int i = 0; i < leng1; i++) {
            if (a[i] == a[leng1 - 1 - i]) {
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("This array is ASYMMETRY");
        } else {
            System.out.println("This array is SYMMETRY");
        }
    }
}
