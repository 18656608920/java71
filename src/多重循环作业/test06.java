package 多重循环作业;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum1=0;
        double sum2=0;
        double sum3=0;
        double max=0;
        double max1=0;
        double max2=0;
        double max3=0;
        for (int i=1;i<=3;i++){
            double sum =0;
            for (int j=1;j<=5;j++){
                System.out.println("请输入第"+i+"个班第"+j+"个同学的分数");
            }
            double score = input.nextInt();
            if (i==1){
                max=score;sum+=score;
            }else if (max<score){
                max=score;
            if (i==1){
                sum1=sum;
                max1=max;
            }else if (i==2){
                sum2=sum;
                max2=max;
            }else if (i==3){
                sum3=sum;max3=max;
            }
        }
            if (max1>=max2&&max1>=max3){
                System.out.println("全部分数最高分为 "+max1);
            }else if (max2>=max1&&max2>=max3){
                System.out.println("全部分数最高分为 "+max2);
            }else if (max3>=max2&&max3>=max1){
                System.out.println("全部分数最高分为 "+max3);
            }
            System.out.println("第1班总分为 ："+sum1+"平均分为： "+sum1/5+"最高分为： "+max1);
            System.out.println("第2班总分为 ："+sum2+"平均分为： "+sum2/5+"最高分为： "+max2);
            System.out.println("第3班总分为 ："+sum3+"平均分为： "+sum3/5+"最高分为： "+max3);
        }
    }
}

