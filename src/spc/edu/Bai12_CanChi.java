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
public class Bai12_CanChi {
    public static void main(String[] args){
    String CanArr[] = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
        String ChiArr[] = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Meo", "Thin", "Ty", "Ngo", "Mui"};
        System.out.println("Can Chi Dayyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam:");
        int nam, namcan, namchi;
        nam = sc.nextInt();
        namcan = nam % 10;
        namchi = nam % 12;
        System.out.println(CanArr[namcan] + " ");
        System.out.println(ChiArr[namchi] + " ");
    }
}
