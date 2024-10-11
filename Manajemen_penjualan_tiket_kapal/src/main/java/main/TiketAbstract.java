/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ACER
 */
public class TiketAbstract {

    private final String id;
    private final String namaKapal;
    private final String tanggal;
    private double harga;

    public TiketAbstract(String id, String namaKapal, String tanggal, double harga) {
        this.id = id;
        this.namaKapal = namaKapal;
        this.tanggal = tanggal;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNamaKapal() {
        return namaKapal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama Kapal: " + namaKapal + ", Tanggal: " + tanggal + ", Harga: " + harga;
    }
}


