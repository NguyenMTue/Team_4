
package baitapthuchanh;

import java.util.List;

class SinhVien
{
    private String Masv;
    private String Ten;
    private float DTB;
    public SinhVien(String Masv, String Ten, float DTB )
    {
        this.Masv = Masv;
        this.Ten = Ten;
        this.DTB = DTB;
    }
    public String getMasv(){
        return Masv; 
    }
    public String getTen(){
        return Ten;
    }
    public float getDTB(){
        return DTB;
    }
    @Override
    public  String toString(){
        return "Mã sinh viên: " + Masv + ", Tên: " + Ten + ", Điểm trung bình: " + DTB;
    }
}
public class Bai7_Tuan5 {
    private List<SinhVien> sinhViens;
    public void THEMSV(SinhVien sinhvien){
        sinhViens.add(sinhvien);
    }
    public void XOASV(String Masv){
        sinhViens.remove(sinhvien -> sinhvien.getMasv().equals(Masv));
    }
}
