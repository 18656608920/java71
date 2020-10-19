package 多重数组;

import java.util.Arrays;
import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        String []food=new String[5];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<food.length;i++){
            System.out.println("输入第"+(i+1)+"水果");
            food[i]=input.next();
        }
        Arrays.sort(food);
        System.out.println("顺序为");
        for (int i=0;i<food.length;i++){
            System.out.println(food[i]);
        }
    }
}
