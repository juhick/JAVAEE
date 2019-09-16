package Experiment_01_2;

public class Main {
    public static void main(String[] args){
        int ans = 0;
        for (int i = 1; i < 7; i++){
            ans += i * 10 + i;
        }
        System.out.println(ans);
    }
}
