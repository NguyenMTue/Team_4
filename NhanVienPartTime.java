package quanlynhahang;

import java.util.Date;

public class NhanVienPartTime extends NhanVien {
    private int soGioLamViec;

    public NhanVienPartTime(String maNV, String tenNV, Date ngayVaoLam, double luongCoBan, String soDT, int soGioLamViec) {
        super(maNV, tenNV, ngayVaoLam, luongCoBan, soDT);
        this.soGioLamViec = soGioLamViec;
    }

    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số giờ làm việc: " + soGioLamViec;
    }

    // Tính lương cho nhân viên PartTime
    @Override
    public void TinhLuong() {
        // Tính lương cho nhân viên PartTime = Lương cơ bản * Số giờ làm việc
        this.luongThucNhan = getLuongCoBan() * soGioLamViec;
    }
}