package Baitap;

public class Lesson7_2 {

    public static void main(String[] args) {
        String[] name = {
            "Nguyen Van A",
            "Tran Minh B",
            "Le Thi C",
            "To Thanh D",
            "La Ngoc Bao E"
        };
        int[] point = {10, 5, 2, 9, 4};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j > 0 && point[j] < point[j - 1]) {
                    int x = point[j];
                    point[j] = point[j - 1];
                    point[j - 1] = x;
                    String y = name[j];
                    name[j] = name[j - 1];
                    name[j - 1] = y;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + " - " + point[i]);
        }
    }
}
