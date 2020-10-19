package 数组;

public class test02 {
    public static void main(String[] args) {
        int[]score = new int[3];//数组越界
        score[0]=89;
        score[1]=63;
        score[2]=79;
        score[3]=43;
        System.out.println(score[3]);
    }
}
