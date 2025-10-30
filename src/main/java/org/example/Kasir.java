package org.example;

import java.util.ArrayList;

public class Kasir {
    ArrayList<Item> daftarBarang = new ArrayList<>();

    public void tambahBarang(Item item) {
        daftarBarang.add(item);
    }

    public double hitungTotal() {
        double total = 0;
        for (Item item : daftarBarang) {
            total += item.getSubtotal();
        }
        return total;
    }
    public void tampilkanStruk() {
        System.out.println("\n===== STRUK BELANJA =====");
        for (Item item : daftarBarang) {
            System.out.println(item.nama + " x" + item.jumlah + " = Rp " + item.getSubtotal());
        }
        double total = hitungTotal();
        double diskon = (total > 100000) ? 0.1 * total : 0;
        System.out.println("--------------------------");
        System.out.println("Total: Rp " + total);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Bayar: Rp " + (total - diskon));
        System.out.println("==========================");
    }
}
