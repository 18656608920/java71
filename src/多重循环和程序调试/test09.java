package 多重循环和程序调试;

public class test09 {
    //实现输出1-10中4以下的数
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            if (i%4==0){
                return;
            }
            System.out.println(i+" ");
        }
        System.out.println("循环结束");
    }
}
