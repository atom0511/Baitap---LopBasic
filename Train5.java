package train;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Train5 {

    static int line = 4;
    static int column = 4;
    static int x, y;
    static int[][]arr1;
    static int[][]arr2;
    
    public static void main(String[] args) {
        arr2 = arrayRandom();
        while(true){
        arr1 = show();
        int enterX = inputL();
        int enterY = inputC();
        open(enterX, enterY);
//        likeOrDifferent = check();
//        close(enterX);
        } 
    }
    
    static int[][] arrayRandom() {
        int[][] arr = new int[line][column];
        Random rd = new Random();
        int num = 1;
        boolean flag = true;
        while (flag) {
            int m = rd.nextInt(line);
            int n = rd.nextInt(column);
            if (arr[m][n] == 0) {
                arr[m][n] = num;
                num++;
                if (num == 9) {
                    num = 1;
                }
            }
            int count = 0;
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if (arr[i][j] == 0) {
                        count++;
                    }
                }
            }

            if (count == 0) {
                flag = false;
            }
        }
        return arr;
    }
    
    
    static int[][] show() {
        int[][] arr = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return arr;
    }

    static int inputL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tọa độ hàng x =  ");
        x = sc.nextInt();
        return x;
    }

    static int inputC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tọa độ cột y = ");
        y = sc.nextInt();
        return y;
    }

    static void open(int enter1, int enter2) {
        arr1[enter1][enter2] = arr2[enter1][enter2]; 
    }
    
//    static boolean check(){};
//    static void close(){};
}
