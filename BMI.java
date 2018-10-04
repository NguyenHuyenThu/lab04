/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 *
 * @author Thu
 */
public class BMI {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
//Nhập vào cân nặng chiều cao        
        System.out.println("weight (kg) and height(m)");
            float w=scanner.nextFloat();
            float h=scanner.nextFloat();
//Gọi phương thức tính BMI            
        System.out.println(setBMI(w,h));
    
    
    }
public static String setBMI(float w,float h){
//Công thức tính chỉ số BMI    
    float BMI=w/(h*h);
//Các trường hợp     
        if(BMI <18.5)
            return "Underweight";
        else if(18.5<=BMI&&BMI <23)
            return "Normal";
        else if(23<=BMI&&BMI<=24.99)
            return "Overweight";
        else 
            return "Fat";
   
}
    
}   

