package quanlynhahang;

import java.util.HashMap;
import java.util.Map;

public class ThucDon {
    private HashMap<String, Double> menu;

    public ThucDon() {
        this.menu = new HashMap<>();
    }
    
    public void themMon(String tenMon, double gia) {
        if (menu.containsKey(tenMon)) {
            System.out.println("Món ăn " + tenMon + " đã có trong thực đơn!");
        } else {
            menu.put(tenMon, gia);
            System.out.println("Đã thêm món: " + tenMon + " - Giá: " + gia + " VND");
        }
    }
    
    public void xoaMon(String tenMon) {
        if (menu.containsKey(tenMon)) {
            menu.remove(tenMon);
            System.out.println("Đã xóa món: " + tenMon + " khỏi thực đơn.");
        } else {
            System.out.println("Món ăn " + tenMon + " không tồn tại trong thực đơn!");
        }
    }

    public void hienThiThucDon() {
        if (menu.isEmpty()) {
            System.out.println("Thực đơn hiện đang trống!");
        } else {
            System.out.println("Thực đơn nhà hàng:");
            for (Map.Entry<String, Double> entry : menu.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " VND");
            }
        }
    }

    public Double layGiaMon(String tenMon) {
        return menu.getOrDefault(tenMon, null);
    }
}