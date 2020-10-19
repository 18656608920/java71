package 数组;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        int[] world={1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int i = input.nextByte();
        boolean flag= false;
        for (int num:world){
            if (num==i){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
