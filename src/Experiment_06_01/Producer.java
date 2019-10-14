package Experiment_06_01;

import java.util.Random;

public class Producer implements Runnable{
    private MyNumber myNumber;


    public Producer(MyNumber myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void run() {
        while(true){
            Random random = new Random();
            myNumber.addNumber(random.nextInt(10));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
