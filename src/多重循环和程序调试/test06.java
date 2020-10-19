package 多重循环和程序调试;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        int score;//成绩
        int total;//班级总人数
        int num = 0;//成绩大于80分的人数
        Scanner input = new Scanner(System.in);
        System.out.println("输入班级总人数");
        total = input.nextByte();
        for (int i =0;i<total;i++){
            System.out.println("输入第"+(i+1)+"位学生的成绩");
            score = input.nextInt();
            if (score<80){
                continue;
            }
            num++;
        }
        System.out.println("成绩大于80分的学生人数是"+num);
        double rate = (double) num/total*100;
        System.out.println("80分以上的学生所占比例为"+rate+"%");
    }
}
