package Tuan4_Bai1;
import java.util.Scanner;
public class Tuan4_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,tong;
		tong=0;
		System.out.println("nhap gia tri n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			tong+=i;
		}
		System.out.println("Tong cac chu so tu 1 den n la :"+tong);
	}

}
