package 二维数组;
import java.util.Random;
public class work03 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] stu=new int[3][5];
        int[] sum=new int[3];
        int[] ave=new int[5];
        int a =0;
        System.out.println("学号"+"\t"+"core C++"+"\t"+"coreJava"
                +"\t"+"Servlet"+"\t\t"+"JSP"+"\t\t"+"EJB"+"\t\t"+"总成绩");

        for (int i = 0; i < stu.length; i++) {
            System.out.print(i+1+"\t");
            for (int j = 0; j < stu[i].length; j++) {
                stu[i][j]=rd.nextInt(50)+50;
                System.out.print(stu[i][j]+"\t\t");
                sum[i]+=stu[i][j];
                ave[j]+=stu[i][j];

            }
            a+=sum[i];
            System.out.print(" ");
            System.out.println(sum[i]);

        }
        System.out.print("平均分"+"\t");
        for (int i = 0; i < ave.length; i++) {
            System.out.print(ave[i]/3+"\t\t");
        }
        System.out.print(a/3);

    }
}
