package com.ug9.etransactionproject;

import com.ug9.eTransactionProject.DigitalPayment;

public class MobileBanking extends com.ug9.eTransactionProject.DigitalPayment {
    private boolean checkFee;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening(){
        return noRekening;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (saldo < 0){
            System.out.print("Input Tidak Valid");
        }
        if (isCheckFee() = True){
            penerima.saldo += nominal
        }

        super.printBuktiTransfer();
    }

    public boolean isCheckFee(){
        return False;
    }

    public void setCheckFee(boolean){

    }
}
