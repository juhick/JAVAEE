package Experiment_05_02;

import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet {

    public void paint(Graphics g){
        g.drawString("*  *  *  *  *", 50, 25);
        g.drawString("*             *", 50, 35);
        g.drawString("*             *", 50, 45);
        g.drawString("*             *", 50, 55);
        g.drawString("*  *  *  *  *", 50, 65);

        int x0, y0, r;

        x0 = 100;
        y0 = 100;
        r = 20;

        int a, b;
        int di;
        a = 0;b = r;
        di=3-(r<<1);//判断下个点位置的标志

        int count = 0;

        while(a<=b)
        {
            if (count % 4 == 0){
                g.drawString("*",x0-b,y0-a);             //3
                g.drawString("*",x0+b,y0-a);             //0
                g.drawString("*",x0-a,y0+b);             //1
                g.drawString("*",x0-b,y0-a);             //7
                g.drawString("*",x0-a,y0-b);             //2
                g.drawString("*",x0+b,y0+a);             //4
                g.drawString("*",x0+a,y0-b);             //5
                g.drawString("*",x0+a,y0+b);             //6
                g.drawString("*",x0-b,y0+a);
            }
            a++;
            //使用Bresenham算法画圆
            if(di<0) di+=4*a+6;
            else
            {
                di += 10+4*(a-b);
                b--;
            }
            if (count % 4 == 0) {
                g.drawString("*", x0 + a, y0 + b);
            }
            count++;
        }
    }
}
