package Baitap;

import java.util.Scanner;

public class Lesson1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Bai1
        
        System.out.println("BAI 1");
    
        System.out.println("");
        System.out.print("Nhap vao gia tri a = ");
    double a = sc.nextInt();
        System.out.print("Nhap vao gia tri b = ");
    double b = sc.nextInt();
        System.out.println("Tong a + b = " + (a+b) );
        System.out.println("Hieu a - b = " + (a-b) );
        System.out.println("Tich a * b = " + (a*b) );
        System.out.println("Thuong a / b = " + (a/b) );
        System.out.println("Luy thua a ^ b = " + Math.pow(a, b) );
    
        //Bai2
        
        System.out.println("------------------------");
        System.out.println("BAI 2");
        System.out.println("");
        
        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c = 0");
        System.out.println("Nhap lan luot cac he so a, b, c");
        System.out.print("a = ");
        double x = sc.nextInt();
        System.out.print("b = ");
        double y = sc.nextInt();
        System.out.print("c = ");
        double z = sc.nextInt();
        System.out.println("Phuong trinh cua ban la: " + x + "x^2 + " + y + "x + " + z + " = 0");
        double delta = y*y - 4*x*z;
        double canDelta = Math.sqrt(delta);
        double nghiemKep = (-y) / (2*x);
        double nghiem1 = (-y + canDelta) / (2*x);
        double nghiem2 = (-y - canDelta) / (2*x);
        System.out.println("Co delta ▲ = b^2 - 4a*c = " + delta);
        if(delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0){
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + nghiemKep );
        } else if (delta > 0){
            System.out.println("Phuong trinh co 2 nghiem:\n x1 = " + nghiem1 + "x2 = \n" + nghiem2 );
        }
        
   }
}
