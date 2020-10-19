package 数组;

import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] price = new int[4];
        for (int i=0;i < price.length;i++){
            System.out.println("请输入"+(i+1)+"手机价格");
            price[i]= input.nextInt();
        }
        int min = price[0];
        for (int i = 1;i<price.length;i++){
            if (price[i]<min){
                min = price[i];
            }
        }
        System.out.println("最低价格为"+min);
    }
}
