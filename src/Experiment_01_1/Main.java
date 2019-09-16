package Experiment_01_1;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //ax^2+bx+c=0
        System.out.println("请输入参数：");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double delta;

        delta = b * b - 4 * a * c;

        if (delta < 0){
            System.out.println("方程无解");
        }else if(delta == 0){
            System.out.println("方程的解为："+(-b/(2 * a)));;
        }else{
            System.out.println("方程的解1为："+((-b + (Math.sqrt(delta)))/(2 * a)));
            System.out.println("方程的解2为："+((-b - (Math.sqrt(delta)))/(2 * a)));
        }

    }
}
