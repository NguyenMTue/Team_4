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
public class Bai4_Tuan5 {
    
    public static int Soxhnhieunhat(int [] a, int n){
        int Dadem = 0;
        int max = a[0];
        for(int i=0; i< n; i++){
            int dem=0;
            for(int j=0; j< n; j++)
                if(a[j]==a[i])
                    dem++;
            if(dem>Dadem){
                Dadem=dem;
                max=a[i];
            }        
        }
        return max;
            
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap do dai day so");
        int n = sc.nextInt();
        int [] a= new int[n];
        System.out.println("Nhap cac phan tu cau mang");
        for(int i=0; i< n;i++)
            a[i] = sc.nextInt();
        int max = Soxhnhieunhat(a,n);
        System.out.println("Phan tu xuat hien nhieu nhat:" +max);
              
        
    }
}
