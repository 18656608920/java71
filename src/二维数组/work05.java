package 二维数组;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("输入行和列");
        int m=input.nextInt();
        int n=input.nextInt();
        int [][]arr1=new int[m][n];
        int [][]arr2=new int[n][m];
        System.out.println("输入数组的元素");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("依次打印输入的二维数组：");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] + "   ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[j][i] = arr1[i][j];
            }
        }

        System.out.println("依次输出行列颠倒的二维数组：");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
