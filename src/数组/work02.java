package 数组;

import java.util.Scanner;

public class work02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        double[] money=new double[5];
        for(int i =0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"金额：");
            money[i] =input.nextDouble();
            sum+=money[i];
        }
        System.out.println("总金额为"+sum);
        }
    }




