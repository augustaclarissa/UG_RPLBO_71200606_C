package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public Pelayanan(int idPelayan, String nama) {
        this.idPelayan = idPelayan;
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien p, Dokter d, Jadwal j){
        if(!pasien.getStatus()) {
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setStatusDaftar(statusDaftar);
            System.out.println("PROSES PENJADWALAN BERHASIL");
        }else{
            System.out.println("");
        }
    }
    public void registrasi() pasien

    public Pasien registrasi(){
        Scanner nama=new Scanner(System.in);
        String namaPasien;
        System.out.println("Masukan nama anda: ");
        namaPasien = nama.nextLine();

        Scanner usia=new Scanner(System.in);
        int usiaPasien;
        System.out.println("Masukan usia anda: ");
        usiaPasien = usia.nextInt();

        Scanner alamat=new Scanner(System.in);
        String alamatPasien;
        System.out.println("Masukan alamat anda: ");
        alamatPasien = alamat.nextLine();

        Scanner penyakit=new Scanner(System.in);
        String penyakitPasien;
        System.out.println("Masukan penyakit anda: ");
        penyakitPasien = penyakit.nextLine();

        System.out.println("Proses registrasi berhasil");
        return new Pasien(nama,usia,alamat,penyakit);
    }

}
}
