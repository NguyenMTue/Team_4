package quanlynhahang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements ITINHLUONG {
    private String maNV;
    private String tenNV;
    private Date ngayVaoLam;
    private double luongCoBan;
    private String soDT;
    private String password;
    protected double luongThucNhan;

    public NhanVien(String maNV, String tenNV, Date ngayVaoLam, double luongCoBan, String soDT) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngayVaoLam = ngayVaoLam;
        this.luongCoBan = luongCoBan;
        this.soDT = soDT;
        this.password = "123";  // Mật khẩu mặc định là 123
        this.luongThucNhan = 0.0;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public String getSoDT() {
        return soDT;
    }

    public double getLuongThucNhan() {
        return luongThucNhan;
    }

    public String getPassword() {
        return password;
    }

    public boolean dangNhap(String maNV, String password) {
        return this.maNV.equals(maNV) && this.password.equals(password);  // Kiểm tra mã nhân viên và mật khẩu
    }

    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.password.equals(matKhauCu)) {
            // Nếu đúng, đổi mật khẩu
            this.password = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công!");
        } else {
            System.out.println("Mật khẩu cũ không đúng! Đổi mật khẩu thất bại.");
        }
    }

    @Override
    public void TinhLuong() {
        this.luongThucNhan = this.luongCoBan;
    }

    public void inThongTinNhanVien() {
        System.out.println("Mã NV: " + maNV + ", Tên NV: " + tenNV + ", Số ĐT: " + soDT + ", Lương cơ bản: " + luongCoBan + ", Mật khẩu: " + password);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  // Định dạng ngày tháng
        String ngayVaoLamStr = sdf.format(ngayVaoLam);  // Chuyển đổi ngày vào làm thành chuỗi
        return "Mã NV: " + maNV + ", Tên NV: " + tenNV + ", Ngày vào làm: " + ngayVaoLamStr + ", Số ĐT: " + soDT + ", Lương cơ bản: " + luongCoBan + ", Mật khẩu: " + password;
    }
}