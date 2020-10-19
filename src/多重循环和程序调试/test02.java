package 多重循环和程序调试;

public class test02 {
    //打印99乘法表 1*1=1 2*3=6
    public static void main(String[] args) {
        int i;
        int j;//循环变量
        for (i=1;i<=9;i++){
            for (j=1;j<=i;j++){
                //System.out.print(i+"*"+j+"="+(i*j)+"\t");
                System.out.println(String.format("%d*%d=%d",i,j,j*i));
            }
            System.out.println();//打印一行后换行
        }
    }
}
