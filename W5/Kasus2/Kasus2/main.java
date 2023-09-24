/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasus2;
import java.util.Scanner;
/**
 *
 * @author NAUFAL
 */


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int hargatotal = 0;
        String keputusan = "Y";

        penjualan[] penjualanList = new penjualan[100]; // Membuat array penjualan

        // Daftar menu makanan dengan nama, harga, dan kuantitas
        produk[] products = new produk[100];
        products[i] = new produk("Batagor", 5000, 0);
        i++;
        products[i] = new produk("Roti Bakar", 12000, 0);
        i++;
        products[i] = new produk("Indomie+Telor", 10000, 0);
        i++;

        // Memulai proses pembelian
        while (keputusan.equalsIgnoreCase("Y")) {
            System.out.println("Daftar Menu Makanan:");
            for (int j = 0; j < i; j++) {
                System.out.println((j + 1) + ". " + products[j].getName() + " = Rp " + products[j].getPrice());
            }

            System.out.print("Pilih nomor menu yang ingin dibeli: ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= i) {
                System.out.print("Jumlah yang ingin dibeli: ");
                int jumlah = input.nextInt();

                // Mengupdate jumlah dan harga total di objek penjualan
                penjualanList[pilihan - 1] = new penjualan(products[pilihan - 1].getName(), jumlah, products[pilihan - 1].getPrice() * jumlah);

                // Menambahkan total harga
                hargatotal += penjualanList[pilihan - 1].getTotalPrice();

                System.out.print("Beli lagi? (Y/N): ");
                keputusan = input.next();
            } else {
                System.out.println("Nomor menu tidak valid.");
            }
        }

        // Menampilkan ringkasan pembelian
        System.out.println("\nRingkasan Pembelian:");
        for (int j = 0; j < i; j++) {
            if (penjualanList[j] != null && penjualanList[j].getQuantity() > 0) {
                System.out.println(penjualanList[j].getProductName() + " x" + penjualanList[j].getQuantity() +
                        " = Rp " + penjualanList[j].getTotalPrice());
            }
        }
        System.out.println("Total Harga: Rp " + hargatotal);

        input.close();
    }
}
