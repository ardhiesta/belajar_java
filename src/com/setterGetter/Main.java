package com.setterGetter;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Karyawan
        Karyawan karyawan1 = new Karyawan();
        // eksekusi setter
        karyawan1.setNIP("012345");
        karyawan1.setNama("Michael Karjono");
        karyawan1.setJenisKelamin("Laki-laki");
        // eksekusi getter
        System.out.println("NIP: "+karyawan1.getNIP());
        System.out.println("Nama: "+karyawan1.getNama());
        System.out.println("Jenis kelamin: "+karyawan1.getJenisKelamin());
    }
}
