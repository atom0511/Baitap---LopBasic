package Baitap;

import java.util.Scanner;

public class Lesson8_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int leng = sc.nextInt();
        int[] arr = new int[leng];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < leng; i++) {
            String token = sc.next();
            arr[i] = Integer.parseInt(token);
        }
        for (int i = 0; i < leng; i++) {
            if(arr[i] < 10 && arr[i] % 2 == 1){
                System.out.println("The element to find is: " + arr[i]);
                break;
            }
            
            if ((arr[i] / 10) % 2 == 1) {
                System.out.println("The element to find is: " + "arr[" + i + "] = " + arr[i]);
                break;
            }
        }
    }
}
