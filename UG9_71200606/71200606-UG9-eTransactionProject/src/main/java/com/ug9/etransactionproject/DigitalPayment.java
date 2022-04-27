package com.ug9.eTransactionProject;

import com.ug9.etransactionproject.BNImo;
import com.ug9.etransactionproject.BRImo;
import com.ug9.etransactionproject.Dana;
import com.ug9.etransactionproject.Ovo;

public abstract class DigitalPayment {
    private String nama;
    private long saldo;

    public DigitalPayment(String nama, long saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama(String nama) {
        return this.nama;
    }

    public long getSaldo(long saldo) {
        return this.saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public abstract void transfer(DigitalPayment dp, long nominal);

    public void printBuktiTransfer(DigitalPayment penerima,long nominal){
        if (penerima instanceof BNImo){
            System.out.print("Transfer ke BNI Mobile");
        } else if (penerima instanceof BRImo){
            System.out.print("Transfer ke BRI Mobile");
        } else if (penerima instanceof Dana){
            System.out.print("Transfer ke DANA");
        } else if (penerima instanceof Ovo){
            System.out.print("Transfer ke OVO");
        }
        System.out.println(" atas nama "+penerima.nama+" sebesar Rp "+nominal+" sukses");
    }
}
