import java.util.Scanner;

public class tuan4_bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so nguyen: ");
        int n = sc.nextInt();
        int soGoc=n;
        int daoNguoc = 0;
        while (n>0)
        {
            int soCuoi = n % 10;
            daoNguoc = daoNguoc*10+soCuoi;
            n=n/10;
        }
        if (daoNguoc==soGoc)
            System.out.println(soGoc+" la so doi");
        else
            System.out.println(soGoc+" khong phai la so doi");
    }
}
