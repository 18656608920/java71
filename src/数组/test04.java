package 数组;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]score = new int[5];
        for (int i=0;i< score.length;i++){
            System.out.println("请输入"+(i+1)+"成绩");
            score[i] = input.nextInt();
        }
        //求最高分
        int max = score[0];
        for (int i = 1;i<score.length;i++){
            if (score[i]>max){
                max = score[i];
            }
        }
        System.out.println("最高分为"+max);
    }
}
