package quanlynhahang;

import java.util.ArrayList;

public class QuanLyBanAn {
    private ArrayList<BanAn> danhSachBan;
    private ThucDon thucDon;

    public QuanLyBanAn() {
        this.danhSachBan = new ArrayList<>();
        this.thucDon = new ThucDon();
    }

    public void themBan(BanAn ban) {
        danhSachBan.add(ban);
        System.out.println("Đã thêm bàn: " + ban.getSoBan());
    }

    public void hienThiTatCaBan() {
        if (danhSachBan.isEmpty()) {
            System.out.println("Chưa có bàn nào trong danh sách.");
        } else {
            System.out.println("Danh sách bàn:");
            for (BanAn ban : danhSachBan) {
                ban.inThongTin();
                System.out.println("---------------------------------");
            }
        }
    }

    public void datBan(String soBan, int soKhach) {
        for (BanAn ban : danhSachBan) {
            if (ban.getSoBan().equals(soBan)) {
                if (ban.getTrangThai().equals("Trống")) {
                    if (soKhach > 0) {
                        ban.setTrangThai("Đặt trước");
                        ban.setSoKhach(soKhach);
                        System.out.println("Đã đặt bàn " + soBan + " cho " + soKhach + " khách.");
                    } else {
                        System.out.println("Số khách không hợp lệ, phải lớn hơn 0.");
                    }
                } else {
                    System.out.println("Bàn " + soBan + " không trống, không thể đặt.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy bàn " + soBan);
    }

    public void xoaBan(String soBan) {
        for (int i = 0; i < danhSachBan.size(); i++) {
            if (danhSachBan.get(i).getSoBan().equals(soBan)) {
                danhSachBan.remove(i);
                System.out.println("Đã xóa bàn " + soBan + " khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy bàn " + soBan);
    }

    public void goiMon(String soBan, String tenMon) {
        Double giaMon = thucDon.layGiaMon(tenMon);
        if (giaMon == null) {
            System.out.println("Món " + tenMon + " không có trong thực đơn!");
            return;
        }

        for (BanAn ban : danhSachBan) {
            if (ban.getSoBan().equals(soBan)) {
                if (!ban.getTrangThai().equals("Trống")) {
                    ban.goiMon(tenMon, thucDon);
                } else {
                    System.out.println("Bàn " + soBan + " chưa được đặt. Không thể gọi món.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy bàn " + soBan);
    }

    public void hienThiThucDon() {
        thucDon.hienThiThucDon();
    }

    public void themMonThucDon(String tenMon, double gia) {
        thucDon.themMon(tenMon, gia);
    }

    public void xoaMonThucDon(String tenMon) {
        thucDon.xoaMon(tenMon);
    }
    public BanAn timBan(String soBan) {
        for (BanAn ban : danhSachBan) {
            if (ban.getSoBan().equals(soBan)) {
                return ban;
            }
        }
        return null;
    }
}