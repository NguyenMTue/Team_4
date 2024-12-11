package quanlynhahang;

public class BanThuong extends BanAn {
    private int soGhe;

    public BanThuong(String soBan, int soKhach, int soGhe) {
        super(soBan, soKhach);
        this.soGhe = soGhe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số ghế: " + soGhe);
    }

    @Override
    public void TinhTien() {
        super.TinhTien();
        System.out.println("Tổng tiền bàn " + getSoBan() + ": " + getTongTien() + " VND");
    }
}