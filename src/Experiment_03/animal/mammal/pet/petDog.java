package Experiment_03.animal.mammal.pet;

import Experiment_03.animal.mammal.Dog;

public class petDog extends Dog implements pet{

    private String master;
    private double price;

    @Override
    public String getMaster() {
        return this.master;
    }

    @Override
    public void setMaster(String a) {
        this.master = a;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double a) {
        this.price = a;
    }

    @Override
    public void printMaster() {
        System.out.println("我的主人是：" + this.master);
    }

    @Override
    public void printPrice() {
        System.out.println("我的价格是：" + this.price + "元");
    }
}
