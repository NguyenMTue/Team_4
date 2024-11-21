package com.Quoc.Tuan5_Bai2;
import java.util.Scanner;
public class Tuan5_Bai2 {
	    public static void main(String[] args) {
	       Scanner scanner=new Scanner(System.in);
	        System.out.print("Nhap so phan tu trong mang:");
	        int n=scanner.nextInt();
	        int[] array = new int[n];
	        for(int i=0 ; i<n ; i++){
	            System.out.print("Phan tu thu " +(i+1)+":");
	            array[i] = scanner.nextInt();
	    
	    }
	    for(int i=0;i<n/2;i++){
	    int tam = array[i];
	    array[i] = array[n-1-i];
	    array[n-1-i] = tam;
	    }
	    System.out.println("Mang sau khi dao nguoc:");
	    for(int i=0;i<n;i++){
	        System.out.println(array[i]+" ");
	    }
	}
	}

