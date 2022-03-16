package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods = new ArrayList<>();
    private ArrayList<Double> acceptanceBalance = new ArrayList<>();
    private double consumerMoney;

    public VendingMachines(Codes code){
        this.code = code;
    }

    public VendingMachine(String code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }

    public VendingMachines(String code, int capacity, int goods, ArrayList<Goods> goods, ArrayList<Double> acceptanceBalance){
        this.code = code;
        this.capacity = capacity;
    }

    public void proceedOrder(String goodsCode, int orderQuantity){

    }

    public void takeMoney(double money){

    }

    private void giveGood(double goodsPrice, String goodsName){

    }

    public static double withdrawMoney(){

    }

    public void inputGoods(ArrayList<Goods>){

    }



}

