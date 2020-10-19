package 数组;

import java.util.Scanner;
//猜数游戏
public class test03 {
    public static void main(String[] args) {
        int[] a = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int num : a) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("和为" + sum);
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int guess = input.nextByte();
        boolean flag = false;
        for (int num : a) {
            if (num == guess) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
    }
}
