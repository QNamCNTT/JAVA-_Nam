/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class De2cau1_Java {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng số Fibonacci
        System.out.print("Nhap do vao: ");
        int n = scanner.nextInt();

        // Khởi tạo ArrayList để lưu trữ dãy Fibonacci
        ArrayList<Integer> fibonacciList = new ArrayList<>();

        // Tính dãy Fibonacci
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacciList.add(1);
            } else if (i == 1) {
                fibonacciList.add(1);
            } else {
                int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
                fibonacciList.add(nextFibonacci);
            }
        }

        // Xuất dãy số Fibonacci
        System.out.println("Day so Fibonacci la: ");
        for (int number : fibonacciList) {
            System.out.print(number + " ");
        }

        // Tính tổng dãy số
        int sum = 0;
        for (int number : fibonacciList) {
            sum += number;
        }

        // Xuất tổng dãy số
        System.out.println("\nTong cua day so tren la: " + sum);
        
        scanner.close();
       
    }
}
