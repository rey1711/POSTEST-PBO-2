package main;

import java.util.Scanner;
import model.SistemPenjualanTiket;

public class Mainapp {
    public static void main(String[] args) {
        SistemPenjualanTiket sistemPenjualan = new SistemPenjualanTiket();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Tiket");
                System.out.println("2. Tampilkan Tiket");
                System.out.println("3. Update Tiket");
                System.out.println("4. Hapus Tiket");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (choice) {
                    case 1 -> {
                        // Tambah Tiket
                        System.out.print("Masukkan ID tiket: ");
                        String id = scanner.nextLine();
                        System.out.print("Masukkan Nama Kapal: ");
                        String namaKapal = scanner.nextLine();
                        System.out.print("Masukkan Tanggal (YYYY-MM-DD): ");
                        String tanggal = scanner.nextLine();
                        System.out.print("Masukkan Harga: ");
                        double harga = scanner.nextDouble();
                        // Pilih jenis tiket
                        System.out.print("Apakah ini Tiket VIP? (y/n): ");
                        char jenisTiket = scanner.next().charAt(0);
                        TiketAbstract tiket;
                        if (jenisTiket == 'y' || jenisTiket == 'Y') {
                            tiket = new TiketVIP(id, namaKapal, tanggal, harga);
                        } else {
                            tiket = new TiketReguler(id, namaKapal, tanggal, harga);
                        }
                        sistemPenjualan.tambahtiket(tiket);
                    }

                    case 2 -> // Tampilkan Tiket
                        sistemPenjualan.tampilTiket();

                    case 3 -> {
                        // Update Tiket
                        System.out.print("Masukkan ID tiket yang ingin diupdate: ");
                        String idToUpdate = scanner.nextLine();
                        System.out.print("Masukkan harga baru: ");
                        double newPrice = scanner.nextDouble();
                        sistemPenjualan.updateTiket(idToUpdate, newPrice);
                    }

                    case 4 -> {
                        // Hapus Tiket
                        System.out.print("Masukkan ID tiket yang ingin dihapus: ");
                        String idToDelete = scanner.nextLine();
                        sistemPenjualan.hapusTiket(idToDelete);
                    }

                    case 5 -> System.out.println("Keluar dari program.");

                    default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
                }
            } while (choice != 5);
        }
    }
}
