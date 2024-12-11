package quanlynhahang;

import java.util.ArrayList;

public class BanVIP extends BanAn {
    private ArrayList<String> danhSachDichVuVIP;
    private static final double GIA_DICH_VU_VIP = 500000;

    public BanVIP(String soBan, int soKhach) {
        super(soBan, soKhach);
        this.danhSachDichVuVIP = new ArrayList<>();
    }

    public void themDichVuVIP(String dichVu) {
        danhSachDichVuVIP.add(dichVu);
        System.out.println("Đã thêm dịch vụ: " + dichVu);
    }

    @Override
    public void TinhTien() {
        super.TinhTien();
        if (!danhSachDichVuVIP.isEmpty()) {
            System.out.println("Dịch vụ VIP đã chọn:");
            for (String dichVu : danhSachDichVuVIP) {
                System.out.println("- " + dichVu);
            }
            System.out.println("Tổng chi phí dịch vụ VIP: " + (danhSachDichVuVIP.size() * GIA_DICH_VU_VIP) + " VND");
            double tienDichVuVIP = danhSachDichVuVIP.size() * GIA_DICH_VU_VIP;
            System.out.println("Tổng tiền (bao gồm dịch vụ VIP): " + (getTongTien() + tienDichVuVIP) + " VND");
        } else {
            System.out.println("Không có dịch vụ VIP nào.");
        }
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        if (!danhSachDichVuVIP.isEmpty()) {
            System.out.println("Dịch vụ VIP đã chọn: " + danhSachDichVuVIP);
        } else {
            System.out.println("Chưa chọn dịch vụ VIP.");
        }
    }
}
