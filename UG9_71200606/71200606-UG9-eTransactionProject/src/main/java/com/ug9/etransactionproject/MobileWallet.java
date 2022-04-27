package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class MobileWallet extends com.ug9.eTransactionProject.DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama, saldo);
        this.noHp = noHp;
    }


    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp(){
        return noHp;
    }


    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (saldo < 0){
            System.out.print("Input Tidak Valid");
        }
        if (dp instanceof BNImo ||BRImo) {
            penerima.saldo += nominal
        }
        super.printBuktiTransfer();
    }

}
