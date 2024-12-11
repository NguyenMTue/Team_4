package quanlynhahang;
import java.util.ArrayList;

public class DanhSachNV {
    private ArrayList<NhanVien> danhSachNV;

    public DanhSachNV() {
        danhSachNV = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        danhSachNV.add(nv);
    }

    public boolean xoaNhanVien(String maNV) {
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaNV().equals(maNV)) {
                danhSachNV.remove(nv);
                return true;
            }
        }
        return false;
    }

    public NhanVien timNhanVien(String maNV) {
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public void inDanhSach() {
        if (danhSachNV.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            for (NhanVien nv : danhSachNV) {
                System.out.println(nv);
            }
        }
    }
    public ArrayList<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }
}