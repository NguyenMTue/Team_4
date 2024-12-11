package quanlynhahang;

import java.util.Date;

public class NhanVienFullTime extends NhanVien {
    private double phuCap;

    public NhanVienFullTime(String maNV, String tenNV, Date ngayVaoLam, double luongCoBan, String soDT, double phuCap) {
        super(maNV, tenNV, ngayVaoLam, luongCoBan, soDT);
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String toString() {
        return super.toString() + ", Phụ cấp: " + phuCap;
    }

    // Tính lương cho nhân viên FullTime
    @Override
    public void TinhLuong() {
        // Tính lương cho nhân viên FullTime = Lương cơ bản + Phụ cấp
        this.luongThucNhan = getLuongCoBan() + phuCap;
    }
}