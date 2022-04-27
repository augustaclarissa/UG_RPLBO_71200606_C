package com.ug9.etransactionproject;

public class BNImo extends MobileBanking{
    public BNImo(String nama, long saldo, String noRekening){
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal) {

    }
}
