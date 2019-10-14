package Experiment_06_01;

public class Consumer implements Runnable{
    private MyNumber myNumber;
    private int latest;

    public Consumer(MyNumber myNumber) {
        this.myNumber = myNumber;
        this.latest = 0;
    }

    @Override
    public void run() {
        while(true){
            int id = myNumber.getCount();
            if (id > latest){
                System.out.println("第"+id+"个数为:" + myNumber.getData(id - 1));
                latest = id;
            }
        }
    }
}
