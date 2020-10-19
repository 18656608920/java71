package 多重循环作业;

import java.util.Scanner;

public class HOMEWORK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if ((i*5+j*3+(100-i-j)/3)==100) {
                    System.out.println("公鸡个数："+i);
                    System.out.println("母鸡个数："+j);
                    System.out.println("小鸡个数："+(100-i-j));
                    x++;
                }
            }
        }
        System.out.println("总共有"+x+"种买法");
    }
}