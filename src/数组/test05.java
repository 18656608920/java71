package 数组;

import java.util.Scanner;

public class test05 {
    //插入数字进行比较
    public static void main(String[] args) {
      //int []list={99,85,82,63,60};//静态初始化-赋值
      int [] list = new int[6];
      list[0]=99;
      list[1]=85;
      list[2]=82;
      list[3]=63;
      list[4]=60;
        Scanner input = new Scanner(System.in);
        System.out.println("输入成绩");
        int num = input.nextInt();
        //找到num要插入的位置index  找到num比数组中元素大的位置
        //当插入一个比原数组所有数都小的时候， int index=0就会有问题
        //int index = 0;
        int index = list.length-1;
        for (int i =0;i<list.length;i++){
            if (num>list[i]){
                index = i;
                break;
            }
        }
        //原index位置及以后的所有数据整体往后移
        for (int i =list.length-1;i>index;i--){
            list[i]=list[i-1];//list.length-1为5  list[5]=list[4]以此类推
        }
        //在index位置将num插入进去
        list[index]=num;
        System.out.println("插入的成绩的下标为"+index);
        System.out.println("插入新的最后的成绩");
        for (int listnum:list){
            System.out.println(listnum);
        }
    }
}
