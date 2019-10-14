package Experiment_06_01;

import java.util.Vector;

public class MyNumber {
    private Vector data;

    MyNumber(){
        data = new Vector();
    }

    public void addNumber(int num){
        data.add(num);
    }

    public int getCount() {
        return data.size();
    }

    public int getData(int i){
        return (int)data.get(i);
    }
}
