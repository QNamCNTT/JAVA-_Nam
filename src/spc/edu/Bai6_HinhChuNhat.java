/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai6_HinhChuNhat {
    public static void main(String[] args) {  
        System.out.println("TINH DIEN TICH VA CHU VI HINH CHU NHAT");
        double rong, dai, chuvi, dientich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextDouble();
        
        chuvi = (dai + rong) *2;
        dientich = dai * rong;
        
        System.out.println("Chu vi: " + chuvi);
        System.out.println("Dien tich: " + dientich);
        
    }
}
