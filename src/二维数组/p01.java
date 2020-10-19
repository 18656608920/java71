package 二维数组;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       System.out.println("输入杨辉三角的行数");
       int n=input.nextInt();
       int[][]arr=new int[n][n];
       for (int x=0;x<arr.length;x++){
           arr[x][0]=1;
           arr[x][x]=1;
       }
       for (int x=0;x<arr.length;x++){
           for (int y=1;y<=x-1;y++){
               arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
           }
       }
       for (int x=0;x<arr.length;x++){
           for (int y=0;y<=x;y++){
               System.out.print(arr[x][y]+"\t");
           }
           System.out.println("  ");
       }
       input.close();
    }
}
