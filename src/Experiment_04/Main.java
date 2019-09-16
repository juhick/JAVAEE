package Experiment_04;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        try{
            String a = args[0];
            String b = args[1];

            if (args.length > 2){
                System.out.println("输入的数字个数太多！");
                System.exit(0);
            }

            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);

            double ans = first/second;

            System.out.println("分子为："+first+"  分母为："+second+"  结果为："+ans);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("输入的数字个数太少！");
        }catch(ArithmeticException e){
            System.out.println("分母不能为0");
        }
    }
}
