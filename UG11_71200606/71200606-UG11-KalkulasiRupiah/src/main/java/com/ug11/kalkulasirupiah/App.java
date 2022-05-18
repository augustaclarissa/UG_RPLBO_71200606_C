package com.ug11.kalkulasirupiah;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main( String[] args )
    {
        String text;
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan teks: ");
        text = a.nextLine();
        String[] b = text.split("");
        String rp = "[A-Z][a-z][1-9]\\d*[,]\\d*";
        System.out.println("Rincian biaya: ");
        System.out.println("Total: "+text);
    }
}