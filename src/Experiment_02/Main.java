package Experiment_02;

import org.jetbrains.annotations.Contract;

public class Main {
    static private int[][] map = new int[3][3];

    static private boolean[] book = new boolean[10];

    static private int number = 0;

    public static void main(String[] args){
        dfs(0);
        if (number == 0)
            System.out.println("没有解!");
    }

    @Contract(pure = true)
    public static boolean isOk(){
        for (int i = 0; i < 3; i++){
            if (map[i][0] + map[i][1] + map[i][2] != 15)
                return false;
        }

        for (int i = 0; i < 3; i++){
            if (map[0][i] + map[1][i] + map[2][i] != 15)
                return false;
        }

        if (map[0][0] + map[1][1] + map[2][2] != 15)
            return false;

        if (map[0][2] + map[1][1] + map[2][0] != 15)
            return false;

        return true;
    }

    public static void dfs(int n){
        if (n == 9){
            if (isOk())
                print();
            return;
        }
        for (int i = 1 ; i <= 9; i++){
            if (!book[i]){
                map[n / 3][n % 3] = i;
                book[i] = true;
                dfs(n + 1);
                book[i] = false;
                map[n / 3][n % 3] = 0;
            }
        }
    }

    public static void print(){
        number++;

        System.out.println("第"+number+"种情况：");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
