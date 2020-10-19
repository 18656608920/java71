package 数组;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        double[] score = new double[30];//声明数组类型，分配数组的空间
        //int [] s = {89,98,78};  便声明遍赋值
        //int[] s1 = new int[]{100,98,90};   便声明遍赋值new int[]{100,98,90}切记不可定义数组长度
        double avg = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        //使用传统for循环的方式，为数组赋值
        //使用for循环来遍历数组的元素下标0-->数组长度
        for (int i=0;i<30;i++){
            System.out.println("请输入第"+(i+1)+"同学成绩");
            score[i] = input.nextInt();//动态根据数组下标获取键盘输入的内容
            //增强型的for（foreach）：迭代为数组元素操作
            //增强型for（数组类型，变量名称，数组名称[数组元素]{循环代码}）
            sum+=score[i];
        }
        //for (double score:score){//double score=score[0],double score=scpre[1]
            //sum +=score;
        }
        //avg = sum/30;
        //System.out.println("班级平均分为:"+avg);
    }
//}
       /* int score = 0;
        double avg = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        for (int i =1;i<=3;i++){
            System.out.println("请输入第"+i+"位同学的java成绩");
            score = input.nextInt();
            sum +=score;
        }
        avg=(int)sum/3;
        System.out.println("同学班级平均分"+avg);
    }
}*/
