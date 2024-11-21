import java.util.Arrays;
import java.util.Scanner;

public class tuan5_bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so phan tu: ");
        int n= sc.nextInt();
        int [] M=new int[n];
        int tong=0;
        for (int i=0;i<=M.length-1;i++)
        {
            System.out.print("m["+i+"]=");
            M[i]=sc.nextInt();
        }
        for (int i=0;i<=M.length-1;i++)
            tong=tong+M[i];
    }
}
