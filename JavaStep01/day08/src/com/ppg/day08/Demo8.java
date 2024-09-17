package com.ppg.day08;

import javax.swing.*;
import java.util.Random;

public class Demo8 {
    public static void main(String[] args) {
        // 图片打乱显示
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                int indexX=random.nextInt(arr[i].length);
                int indexY= random.nextInt(arr.length);
                int temp=arr[i][j];
                arr[i][j]=arr[indexY][indexX];
                arr[indexY][indexX]=temp;
            }
        }
        JFrame jFrame=new JFrame();
        jFrame.setTitle("图片展示");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setSize(375,395);
        JLabel[][] jLabelArray=new JLabel[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                JLabel jLabel=new JLabel();
                jLabel.setIcon(new ImageIcon("day08\\src\\com\\ppg\\images\\"+arr[i][j]+".png"));
                jLabelArray[i][j]=jLabel;
                jLabelArray[i][j].setBounds(90*j,90*i,90,90);
                jFrame.add(jLabelArray[i][j]);
            }
        }
        jFrame.setVisible(true);
    }
}