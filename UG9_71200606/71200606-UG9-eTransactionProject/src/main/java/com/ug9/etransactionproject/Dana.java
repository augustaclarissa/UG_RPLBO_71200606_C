package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal) {

    }

}
