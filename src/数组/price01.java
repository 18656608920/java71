package 数组;

import java.util.Scanner;

public class price01 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int num:a){
            System.out.println(num);
            sum+=num;
        }
        System.out.println("和为"+sum);
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int b = input.nextInt();
        boolean flag = false;
        for (int num:a){
            if (b==num){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("包含");
        }else {
            System.out.println("不包含");
        }
        }
    }

