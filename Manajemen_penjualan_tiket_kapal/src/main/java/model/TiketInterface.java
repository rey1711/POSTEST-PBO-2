package model;

import main.TiketAbstract;

public interface TiketInterface {
    void tambahtiket(TiketAbstract tiket);
    void tampilTiket();
    void updateTiket(String id, double harga);
    void hapusTiket(String id);
}
