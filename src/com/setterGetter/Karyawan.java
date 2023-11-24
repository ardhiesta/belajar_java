package com.setterGetter;

public class Karyawan {
    String NIP;
	String nama;
	String jenisKelamin;

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }
}
