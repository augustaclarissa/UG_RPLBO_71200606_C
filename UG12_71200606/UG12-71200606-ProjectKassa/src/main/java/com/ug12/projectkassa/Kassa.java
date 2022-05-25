package com.ug12.projectkassa;

import java.util.*;

public class Kassa {
    private HashMap <Produk, Integer> pesanan = new HashMap<Produk, Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public Kassa(){
        arrKasir = new ArrayList<Kasir>();
        pesanan = new HashMap<Produk, Integer>();
    }

    public void login(String username, String password){
        if(username.equals((username) && password.equals(password))) {
            System.out.println("Login berhasil!");
        }
        else{
            System.out.println("Username/password Anda salah!");
        }

    }
    public void register(Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getNama() + " berhasil ditambahkan ke dalam sistem");
    }
    public void tambahPesanan(Produk produk, int jumlah){
        pesanan.put(produk, jumlah);
    }
    public void printNota(){
        System.out.println("==========Nota==========");
        System.out.println("Kasir :" + ArrayList<Kasir>);
        System.out.println("No.    Nama Barang    Jumlah   Harga    Sub Total");
        while(pesanan.hasNext()){
            String element = pesanan.next();
            System.out.println(element + "   ");
            System.out.println(produk, jumlah);
        }
        }
    }
    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir: ");
        System.out.println("No.    Nama    Total Penjualan");
        while(arrKasir.hasNext()){
            String element = arrKasir.next();
            System.out.println(element + "   ");
            System.out.println(kasir.getNama());
            System.out.println(kasir.getTotalPenjualan());
        }

    }
}
