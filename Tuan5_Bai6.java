package tuan5_Bai6;
import java.util.ArrayList;
import java.util.Scanner;

public class Tuan5_Bai6 {
    static ArrayList<Integer> a;
    static Scanner sc;
    static int n;
    static int x;
    static int vt;
    static void Nhap(int n) {
        for (int i=0;i<n;i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a.add(sc.nextInt());
        }
    }
    static void Xuat() {
        for (int i=0;i<a.size();i++) {
            System.out.println("a[" +i+"] = "+a.get(i));
        }
    }

    static void them() {
        a.add(vt,x);
    }
    static void Xoa(int vt) {
        if (vt>=0 && vt<a.size()) {
            a.remove(vt);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        a = new ArrayList<>();
        System.out.println("Nhap so phan tu cua mang M:");
        n = sc.nextInt();
        Nhap(n);
        System.out.println("Nhap gia tri va vi tri muon chen:");
        x = sc.nextInt();
        vt = sc.nextInt();
        them(); 
        Xuat(); 
        System.out.println("mang sau khi xoa:");
        Xoa(3);
        Xuat();
    }
}