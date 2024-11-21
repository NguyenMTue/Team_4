/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapCoMy.BaiThucHanh3;
import java.util.Scanner;
public class Tuan4Bai5 {
public static int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int ucln = b;
            b = a % b;
            a = ucln;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        int ucln = UCLN(a, b);
        int bcnn = (a * b) / ucln;
        System.out.println("Ước chung lớn nhất (UCLN) của " + a + " và " + b + " là: " + ucln);
        System.out.println("Bội chung nhỏ nhất (BCNN) của " + a + " và " + b + " là: " + bcnn);
    }  
}
