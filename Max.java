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
public class Max {
    public static void main (String args[]){
  
        Scanner scanner = new Scanner(System.in);
//Khai báo và truyền vào giá trị 2 số nguyên
        System.out.println("Hay nhap vao so a ");
        int a=scanner.nextInt();
        System.out.println("Hay nhap vao so b ");
        int b=scanner.nextInt();
        System.out.println("So lon nhat la "+max(a,b));
    }
//Phương thức trả về gtln của 2 số nguyên
    static int max(int a,int b){
        if(a>=b)    return a;
        else        return b;
    
    }
    
}
