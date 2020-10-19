package 多重循环作业;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("需要几行数字");
        int row = input.nextByte();
        System.out.println(row);
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=(2*i-1);k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
