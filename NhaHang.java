package quanlynhahang;

import java.util.ArrayList;

public class NhaHang {
    private String taiKhoan;
    private String matKhau;
    private ArrayList<NhanVien> danhSachNhanVien;
    private QuanLyBanAn quanLyBanAn;

    public NhaHang(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.danhSachNhanVien = new ArrayList<>();
        this.quanLyBanAn = new QuanLyBanAn();
    }

    // Đăng nhập
    public boolean dangNhap(String taiKhoanNhap, String matKhauNhap) {
        if (this.taiKhoan.equals(taiKhoanNhap) && this.matKhau.equals(matKhauNhap)) {
            System.out.println("Đăng nhập thành công!");
            return true;
        } else {
            System.out.println("Tài khoản hoặc mật khẩu không đúng!");
            return false;
        }
    }

    public QuanLyBanAn getQuanLyBanAn() {
        return quanLyBanAn;
    }
    
    // Thêm nhân viên
    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
        System.out.println("Đã thêm nhân viên: " + nhanVien.getTenNV());
    }

    // Xóa nhân viên
    public void xoaNhanVien(String maNV) {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                danhSachNhanVien.remove(nv);
                System.out.println("Đã xóa nhân viên: " + nv.getTenNV());
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + maNV);
    }

    // Hiển thị danh sách nhân viên
    public void xemDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            System.out.println("Danh sách nhân viên:");
            for (NhanVien nv : danhSachNhanVien) {
                nv.inThongTinNhanVien();
            }
        }
    }

    // Tính lương
    public void tinhLuongNhanVien() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.TinhLuong();
            System.out.println("Nhân viên: " + nv.getTenNV() + ", Lương: " + nv.getLuongThucNhan() + " VND");
        }
    }

    // Quản lý thực đơn
    public void xemThucDon() {
        quanLyBanAn.hienThiThucDon();
    }

    public void themMonThucDon(String tenMon, double gia) {
        quanLyBanAn.themMonThucDon(tenMon, gia);
    }

    public void xoaMonThucDon(String tenMon) {
        quanLyBanAn.xoaMonThucDon(tenMon);
    }
    public void themBanAn(String soBan, int soKhach, String loaiBan, int soGhe) {
        BanAn ban;
        if (loaiBan.equalsIgnoreCase("VIP")) {
            ban = new BanVIP(soBan, soKhach);
        } else if (loaiBan.equalsIgnoreCase("Thuong")) {
            ban = new BanThuong(soBan, soKhach, soGhe);
        } else {
            System.out.println("Loại bàn không hợp lệ!");
            return;
        }

        quanLyBanAn.themBan(ban);
    }

    public void xoaBanAn(String soBan) {
        quanLyBanAn.xoaBan(soBan);  // Sử dụng phương thức trong QuanLyBanAn để xóa bàn
    }
    public boolean dangNhapNhanVien(String maNV, String matKhauNV) {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.dangNhap(maNV, matKhauNV)) {
                System.out.println("Đăng nhập nhân viên thành công!");
                return true;
            }
        }
        System.out.println("Mã nhân viên hoặc mật khẩu không đúng!");
        return false;
    }

    public NhanVien timNhanVien(String maNV) {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;  // Trả về nhân viên nếu tìm thấy
            }
        }
        return null;  // Nếu không tìm thấy, trả về null
    }
}
