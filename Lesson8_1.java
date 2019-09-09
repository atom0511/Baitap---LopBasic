package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8_1 {

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
        boolean flag = true;
        for (int i = 0; i < leng; i++) {
            if(i > 0 && arr[i-1] > arr[i]){
                flag = false;
            }
        }
        if(flag == false){
            System.out.println("Array is not satisfied");
        }else{
            System.out.println("Array is: " + Arrays.toString(arr));
        }
    }
}
