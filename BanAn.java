package quanlynhahang;

import java.util.ArrayList;

public class BanAn implements ITINHTIEN {
    private String soBan;
    private int soKhach;
    private String trangThai;
    private ArrayList<String> danhSachMonAn;
    private double tongTien;

    public BanAn(String soBan, int soKhach) {
        this.soBan = soBan;
        this.soKhach = soKhach;
        this.trangThai = "Trống";
        this.danhSachMonAn = new ArrayList<>();
        this.tongTien = 0.0;
    }

    public String getSoBan() {
        return soBan;
    }

    public int getSoKhach() {
        return soKhach;
    }

    public void setSoKhach(int soKhach) {
        this.soKhach = soKhach;
    }
    
    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ArrayList<String> getDanhSachMonAn() {
        return danhSachMonAn;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void goiMon(String tenMon, ThucDon thucDon) {
        Double giaMon = thucDon.layGiaMon(tenMon);
        if (giaMon != null) {
            danhSachMonAn.add(tenMon);
            tongTien += giaMon;
            System.out.println("Bàn " + soBan + " đã gọi món: " + tenMon + " với giá: " + giaMon + " VND");
        } else {
            System.out.println("Món " + tenMon + " không có trong thực đơn!");
        }
    }

    @Override
    public void TinhTien() {
        System.out.println("Tổng tiền bàn " + soBan + ": " + tongTien + " VND");
    }

    public void inThongTin() {
        System.out.println("Số bàn: " + soBan + ", Số khách: " + soKhach + ", Trạng thái: " + trangThai);
        if (soKhach > 0) {
            if (!danhSachMonAn.isEmpty()) {
                System.out.println("Danh sách món đã gọi: " + danhSachMonAn);
            } else {
                System.out.println("Chưa gọi món nào.");
            }
        } else {
            System.out.println("Chưa có khách đặt bàn.");
        }
    }
}