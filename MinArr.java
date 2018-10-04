/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author Thu16022388
 */
public class MinArr {
    
    
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
//Khai báo và truyền vào kích thước mảng (<=100)
        int n;
        do {
            System.out.println("Nhap vao so luong phan tu(<=100): ");
            n = scanner.nextInt();
        } while (n>100);
//Khai báo mảng s có kích thước là n
        int s[]= new int[n];
//Truyền vào các giá trị của mảng s
        System.out.println("Nhap vao gia tri cac phan tu");   
        for(int i=0;i<n;i++)
            s[i]=scanner.nextInt();
//Gọi phương thức trả về gtnn và in output       
        System.out.println("Gia tri nho nhat cua day so la :"+min(s));
}
//Phương thức trả về giá trị nhỏ nhất
    static int  min(int s[]) {
        int min=s[0];
            for (int i = 0; i < s.length; i++)
                if (s[0] >= s[i]) 
                    min = s[i];
        return min;
    }
}



