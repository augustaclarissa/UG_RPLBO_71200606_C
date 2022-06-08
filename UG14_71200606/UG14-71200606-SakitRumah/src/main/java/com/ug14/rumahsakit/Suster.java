package com.ug14.rumahsakit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(int idSuster, String nama) {
        this.idSuster = idSuster;
        this.nama = nama;
    }

    public void screening(Pasien p, Jadwal j){
        if(pasien.getPenyakit()==null){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else{
            System.out.println("PROSES SCREENING SUSTER BERHASIL");
        }

    }
}
