package 二维数组;

import java.util.Scanner;

public class TEST01 {
    public static void main(String[] args) {
        //计算3个班,每个班3学生，3个班各自的总成绩
        int [][]scores=new int[3][3];
        Scanner input =new Scanner(System.in);
        //外层循环 --班（内循环  --班的学生）
        for (int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"个班");
            for (int j=0;j<scores[i].length;j++){
                System.out.println("请输入第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
                scores[i][j]=input.nextInt();
            }
        }
        //完成3个班级的成绩统计
        System.out.println("统计考试成绩:");
        for (int i=0;i<scores.length;i++){
            int sum=0;
            for (int j=0;j<scores[i].length;j++){
                sum+=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的同学的总成绩："+sum);
        }
    }
}
