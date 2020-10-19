package 多重循环和程序调试;

public class test07 {
    public static void main(String[] args) {
        //实现输出1~10种非4的倍数的数字
        for (int i =1;i<10;i++){
            if (i%4==0){
                continue;
            }
            System.out.println("循环结束");
        }
    }
}
