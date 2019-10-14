package Experiment_05_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

public class Main {
    private JTextArea textArea;
    private Main(){ prepareGUI(); }

    public static void main(String[] args){
        Main scoreView = new Main();
    }

    private void prepareGUI(){
        //设置主界面
        JFrame mainFrame = new JFrame("成绩查询");
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
        mainFrame.setBounds(500, 500, 390, 400);
        //添加提示文字：
        JLabel listLabel = new JLabel("各班级成绩:");
        listLabel.setFont(new Font (Font.DIALOG, Font.BOLD, 15));//设置字体
        listLabel.setBounds(100, 38, 120, 50);
        //添加到列表
        JComboBox scoreComboBox = new JComboBox();
        scoreComboBox.setBounds(200, 50, 80, 30);
        scoreComboBox.addItemListener(new itemHandler());
        //设置文本框
        textArea = new JTextArea(5, 10);
        textArea.setTabSize(4);
        textArea.setLineWrap(true);//激活自动换行功能
        //textArea.setBackground(Color.white);
        textArea.setBounds(100, 100, 180, 200);
        textArea.setEditable(false);
        //设置滚动条
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//使垂直滚动条按需显示
        scroll.setBounds(100, 100, 180, 200);
        //添加列表项
        String[] lists = {"2004(1)班", "2004(2)班", "2004(3)班", "2004(4)班"};
        for (String list : lists) {
            scoreComboBox.addItem(list);
        }
        //添加到Frame
        mainFrame.add(listLabel);
        mainFrame.add(scoreComboBox);
        mainFrame.add(scroll);
        //设置窗体大小
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    class itemHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            String content = itemEvent.getItem().toString();
            switch (content){
                case "2004(1)班":
                    textArea.setText(readTxtFile("src/Experiment_05_01/sources/class1.txt"));
                    break;
                case "2004(2)班":
                    textArea.setText(readTxtFile("src/Experiment_05_01/sources/class2.txt"));
                    break;
                case "2004(3)班":
                    textArea.setText(readTxtFile("src/Experiment_05_01/sources/class3.txt"));
                    break;
                case "2004(4)班":
                    textArea.setText(readTxtFile("src/Experiment_05_01/sources/class4.txt"));
                    break;
            }

        }
    }

    private static String readTxtFile(String path){
        try{
            StringBuilder sb = new StringBuilder();
            String encoding = "UTF-8";
            File file = new File(path);
            if (file.isFile() && file.exists()){
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineText = null;
                while ((lineText = bufferedReader.readLine()) != null){
                    sb.append(lineText);
                    sb.append("\n");
                }
                read.close();
                return sb.toString();
            }else{
                System.out.println("系统找不到指定的文件！");
            }
        } catch (FileNotFoundException e) {
            System.out.println("系统找不到指定的文件！");
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持的编码方式！");
        } catch (IOException e) {
            System.out.println("读入错误！");
        }
        return null;
    }
}
