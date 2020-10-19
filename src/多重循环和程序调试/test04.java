package 多重循环和程序调试;

import java.util.Scanner;
//break语句的使用
public class test04 {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg;
        boolean isNegative = false;//是否为负数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = input.next();
        for (int i = 0;i<=5;i++){
            System.out.println("请输入第"+(i+1)+"门成绩");
            score = input.nextInt();
            if (score<0){
                isNegative = true;
                break;
            }
            sum += score;//累加求和
        }
        if (isNegative){
            System.out.println("请重新输入");
        }else {
            avg = sum/5;
            System.out.println(name+"的平均分"+avg);
        }
    }
}
