import java.util.ArrayList;
import java.util.Scanner;

public class tuan5_bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ds=new ArrayList<>();//khởi tạo danh sách
        System.out.println("Nhap vao so phan tu: ");
        int spt= sc.nextInt();
        for (int i=0;i<spt;i++)
        {
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            int pt= sc.nextInt();
            ds.add(pt);
        }
        System.out.print("danh sách các số nguyên là: ");
        for (int pt:ds)
            System.out.print(pt+" ");
    }
}
