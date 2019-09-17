package Baitap;

import java.util.Random;
import java.util.Scanner;

public class Lesson10 {

    static int x, y;
    static int a, b;
    static int endX, endY;
    static String A = "A";
    static String W = "W";
    static String S = "S";
    static String D = "D";
    static final int LENGTH = 5; //final để cố định length = 5
    static int[][] arr1;

    public static void main(String[] args) {
        x = 1;
        y = 1;
        int[] end = randomEnd();
        endY = end[0];
        endX = end[1];
        boolean winOrLose = true;
        while (winOrLose) {
            show();
            String enter = input();
            move(enter);
            winOrLose = check();
            if (winOrLose == false) {
                show();
                System.out.println("YOU WIN!!!");
            }
        }
    }

    static void show() {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (i == y && j == x) {
                    System.out.print("X ");
                } else if (i == endY && j == endX) {
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    public static int[] randomEnd() {
        Random rd = new Random();

        while (true) {
            endY = rd.nextInt(LENGTH);
            endX = rd.nextInt(LENGTH);
            if (endX != x || endY != y) {
                break;
            }
        }
        return new int[]{endY, endX};
    }

    static String input() {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Nhập W, S, A, D để đi lên xuống trái phải");
            input = sc.nextLine();
            if (input.equals(A) == true || input.equals(W) == true
                    || input.equals(S) == true || input.equals(D) == true) {
                break;
            } else {
                System.out.println("Nhập sai rồi bạn ơi");
                break;
            }
        }
        return input;
    }

    static void move(String vuaNhap) {

        switch (vuaNhap) {
            case "A":
                x = x - 1;
                if (x < 0) {
                    x = LENGTH - 1;
                }
                break;
            case "D":
                x = x + 1;
                if (x == LENGTH) {
                    x = 0;
                }
                break;
            case "W":
                y = y - 1;
                if (y < 0) {
                    y = LENGTH - 1;
                }
                break;
            case "S":
                y = y + 1;
                if (y == LENGTH) {
                    y = 0;
                }
                break;
        }
    }

    static boolean check() {
        boolean result;
        if (x == endX && y == endY) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
