package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
//PHẦN 1: GÁN GIÁ TRỊ ĐIỂM

        // nhập vào số pt và giá trị pt của mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điểm: ");
        int doDaia = sc.nextInt();

        int[] a = new int[doDaia];
        int STTa = 0; // số thứ tự của phần tử mảng a   
        System.out.println("Nhập lần lượt vị trí các điểm: ");
        for (int i = 0; i < a.length; i++) {
            String stt = sc.next();
            a[i] = Integer.parseInt(stt);
        }
        System.out.println("Vị trí các điểm là: " + Arrays.toString(a));

        System.out.print("Nhập độ dài của thước: ");
        int doDain = sc.nextInt();
        int[] n = new int[doDain];
        int giaTri1 = 0; // stt = giá trị của phần tử mảng n
        System.out.println("Thước kẻ dài: [0, 1,..., " + (doDain - 1) + "]");
        for (giaTri1 = 0; giaTri1 < n.length; giaTri1++) {
            n[giaTri1] = giaTri1;
        }

        for (STTa = 0; STTa < a.length; STTa++) {
//            System.out.println("gta = " + a[STTa]); // gta là giá trị từng phần tử của a
            for (giaTri1 = 0; giaTri1 < n.length; giaTri1++) {

                if (n[giaTri1] == -1) { // điều kiện để giữ lại dữ liệu giữa các lần lặp
                    continue;
                }
                n[giaTri1] = giaTri1; // gán giá trị phần tử của n
//                System.out.println("gt1 = " + n[giaTri1]); //gt1 là giá trị từng pt của n

                if (a[STTa] == n[giaTri1]) {
                    n[giaTri1] = -1; // nếu biến của 2 mảng = nhau, ta gán = -1
                } else {
                    n[giaTri1] = 1; // nếu biến của 2 mảng khác nhau, ta gán = 1
                }
            }

//            System.out.println(Arrays.toString(n));
        }

        System.out.println("Các phần tử của mảng sau thay đổi: ");
        System.out.println("vòng a " + Arrays.toString(a));
        System.out.println("vòng n " + Arrays.toString(n));

        
//PHẦN 2: VẼ ĐOẠN THẲNG

        System.out.print("Độ dài đoạn thẳng segLen = ");
        int segLen = sc.nextInt();
        int k = 0;
        int i = 0;
        int x = 0;

        for (i = 0; i < doDain; i++) {
//            System.out.println("i1 = " + i);
            while (n[i] == -1) {
//                System.out.println("i2 = " + i);
                while (n[i] == -1 || n[i] == 1) {
                    i++;
                    k++;
//                    System.out.println("k = " + k);
//                    System.out.println("i = " + i);
                    if (k >= segLen || i == (doDain- segLen_+ 1)) {
                        k = 0;
                        i++;
                        x++;
                        break;

                    }
                }
            }
        }
        System.out.println("segmentNumber = " + x);
    }
}

