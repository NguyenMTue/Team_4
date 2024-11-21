package Bai1;
import java.util.Scanner;
public class Tuan7_Bai1 {
	 public static int count;
	    private double C;
	    private double D;

	    public double getC() {
	        return C;
	    }

	    public void setC(double C) {
	        this.C = C;
	    }

	    public double getD() {
	        return D;
	    }

	    public void setD(double D) {
	        this.D = D;
	    }
	    public Tuan7_Bai1(){count++;}

	    public Tuan7_Bai1(double C, double D) {
	        this.C = C;
	        this.D = D;
	        count++;
	    }
	    public void Nhap1()
	    {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Nhap chieu dai: ");
	        this.C= sc.nextDouble();
	        System.out.println("Nhap chieu rong: ");
	        this.D= sc.nextDouble();
	    }
	    public void Xuat1()
	    {
	        System.out.println("chieu dai : "+this.C);
	        System.out.println("chieu rong: "+this.D);
	        System.out.println("Chu vi CHU NHAT: " +this.tinhChuVi1());
	        System.out.println("Dien tich CHU NHAT: " +this.tinhDienTich1());
	    }
	    public double tinhChuVi1(){
	        return 2*(this.C+ this.D);
	    }
	    public double tinhDienTich1(){
	        return this.C*this.D;
	    }
	    public static void main(String[] args) {
	       Tuan7_Bai1 Q= new Tuan7_Bai1(5.0,4.0);
	       Q.Xuat1();
	    }
	}

