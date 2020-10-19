package 多重数组;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num=new int[10];
        for (int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        for (int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("升序");
        for (int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
        System.out.println("降序");
        int sum = 0;
        for (int i=0;i<num.length;i++){
            sum = num[i]+sum;
        }
        System.out.println("和"+sum);
        int avg = 0;
        for (int i =0;i<num.length;i++){
            avg = num[i]+avg;
        }
        System.out.println("平均数"+avg/num.length);
    }
}
