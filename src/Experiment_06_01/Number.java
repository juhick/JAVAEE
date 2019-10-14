package Experiment_06_01;

public class Number {
    public static void main(String[] args){
        MyNumber myNumber = new MyNumber();

        int base = myNumber.getCount();

        Thread t1 = new Thread(new Producer(myNumber));
        Thread t2 = new Thread(new Consumer(myNumber));

        t1.start();
        t2.start();

    }
}
