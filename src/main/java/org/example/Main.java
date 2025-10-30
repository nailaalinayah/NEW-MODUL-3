package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kasir kasir = new Kasir();

        System.out.println("=== Program Kasir Sederhana ===");
        while (true) {
            System.out.print("Masukkan nama barang (ketik 'selesai' untuk keluar): ");
            String nama = input.nextLine();
            if (nama.equalsIgnoreCase("selesai")) break;

            System.out.print("Masukkan harga: ");
            double harga = input.nextDouble();
            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();
            input.nextLine(); // bersihkan enter

            kasir.tambahBarang(new Item(nama, harga, jumlah));
        }

        kasir.tampilkanStruk();
    }
}