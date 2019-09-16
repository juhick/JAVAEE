package Experiment_04;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        try{
            double a = in.nextDouble();
            double b = in.nextDouble();
            double ans = a/b;
            System.out.println("答案为："+ans);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("输入的数字个数太少！");
        }catch(ArithmeticException e){
            System.out.println("分母不能为0");
        }
    }
}
