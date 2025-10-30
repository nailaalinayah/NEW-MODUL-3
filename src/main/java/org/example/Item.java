package org.example;

public class Item {
    public String nama;
    public double harga;
    public int jumlah;

    /**
     *
     * @param nama
     * @param harga
     * @param jumlah
     */
    public Item(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    /**
     * mendapatkan nilai
     * @return harga * jumlah
     */
    public double getSubtotal() {
        return harga * jumlah;
    }
}
