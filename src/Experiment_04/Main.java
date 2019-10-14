package Experiment_04;

public class Main {

    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){


        try{
            String a = args[0];
            String b = args[1];

            //判断参数是否过多
            if (args.length > 2){
                System.out.println("输入的数字个数太多！");
                System.exit(0);
            }
            //判断输入的是否全是数字
            if (!isNumeric(a) || !isNumeric(b)){
                System.out.println("输入的不全是数字！");
                System.exit(0);
            }

            int  first = Integer.parseInt(a);
            int  second = Integer.parseInt(b);

            int  ans = first/second;

            System.out.println("分子为："+first+"  分母为："+second+"  结果为："+ans);

        }catch(ArrayIndexOutOfBoundsException e){//捕获数组越界异常
            System.out.println("输入的数字个数太少！");
        }catch(ArithmeticException e){//捕获除0异常
            System.out.println("分母不能为0");
        }
    }
}
