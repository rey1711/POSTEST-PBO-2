package model;

import java.util.ArrayList;
import java.util.List;
import main.TiketAbstract;

public final class SistemPenjualanTiket implements TiketInterface {
    private final List<TiketAbstract> daftarTiket;

    public SistemPenjualanTiket() {
        this.daftarTiket = new ArrayList<>();
    }

    @Override
    public void tambahtiket(TiketAbstract tiket) {
        daftarTiket.add(tiket);
        System.out.println("Tiket dengan ID " + tiket.getId() + " berhasil ditambahkan.");
    }

    @Override
    public void tampilTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("Tidak ada tiket yang tersedia.");
            return;
        }
        for (TiketAbstract tiket : daftarTiket) {
            System.out.println(tiket);
        }
    }

    @Override
    public void updateTiket(String id, double harga) {
        for (TiketAbstract tiket : daftarTiket) {
            if (tiket.getId().equals(id)) {
                tiket.setHarga(harga);
                System.out.println("Tiket dengan ID " + id + " berhasil diupdate.");
                return;
            }
        }
        System.out.println("Tiket dengan ID " + id + " tidak ditemukan.");
    }

    @Override
    public void hapusTiket(String id) {
        for (int i = 0; i < daftarTiket.size(); i++) {
            if (daftarTiket.get(i).getId().equals(id)) {
                daftarTiket.remove(i);
                System.out.println("Tiket dengan ID " + id + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Tiket dengan ID " + id + " tidak ditemukan.");
    }
}
