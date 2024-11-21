/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapTLTHDT;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class Bai3_Tuan4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong:");
        int so = scanner.nextInt();
        long giaithua=1;
        for(int i = 1;i<=so;i++){
            giaithua=giaithua * i;
        }
        System.out.println("Giai thua cua " +so +" la: " +giaithua);            
    }
    
}
