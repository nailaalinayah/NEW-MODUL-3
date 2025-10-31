# Program Item - Dokumentasi JavaDoc

Program ini merupakan contoh sederhana dari kelas **Item** yang merepresentasikan suatu barang dengan atribut **nama**, **harga**, dan **jumlah**.  
Program ini dibuat untuk latihan pembuatan dokumentasi menggunakan **JavaDoc** pada mata kuliah *Pemrograman Lanjut*.

---

## 📘 Deskripsi Program
Kelas `Item` menyimpan data barang yang meliputi:
- `nama` → nama barang
- `harga` → harga satuan barang
- `jumlah` → jumlah barang yang dibeli

Selain itu, terdapat method `getSubtotal()` yang menghitung total harga dari barang berdasarkan harga dan jumlah.

---

## 🧩 Struktur Kelas
```java
public class Item {
    public String nama;
    public double harga;
    public int jumlah;

    public Item(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return harga * jumlah;
    }
}
