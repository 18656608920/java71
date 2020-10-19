package 二维数组;

import java.util.Arrays;
import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生个数:");
        int xs = sc.nextInt();
        System.out.println("请输入科目数量:");
        int km = sc.nextInt();
        int[][] arr=new int[xs][km];
        for(int i=0;i<xs;i++){
            for(int j=0;j<km;j++){
                System.out.println("请输入该班级:第"+(i+1)+"个学生;第"+(j+1)+"门功课的成绩:");
                arr[i][j]=sc.nextInt();
            }System.out.println(Arrays.toString(arr));
        }

        Sum(arr);
        average(arr);
        getMax(arr);
        getMin(arr);

    }

    public static void Sum(int[][] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum =+ arr[i][j];
            }
            System.out.println("您输入的第"+(i+1)+"个学生的总分sum="+sum);
        }
    }


    public static void average(int[][] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum =+ arr[i][j];
            }
            int average=sum/3;
            System.out.println("您输入的第"+(i+1)+"个学生的平均分average="+average);
        }
    }

    public static void getMax(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int max =arr[i][0];
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println("您输入的第"+(i+1)+"个学生的最高分max="+max);
        }
    }

    public static void getMin(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr [i][0];
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j] ;
                }
            }
            System.out.println("您输入的第"+(i+1)+"个学生的最低分min="+min);
        }
}
}
