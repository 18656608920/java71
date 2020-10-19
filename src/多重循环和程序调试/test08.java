package 多重循环和程序调试;

public class test08 {
    public static void main(String[] args) {
        //1~10之间偶数和
        int sum = 0;
        for (int i=0;i<=10;i++){
            if (i%2==1){
                continue;//如果i为奇数，结束本次循环，进行下一次循环
            }
            sum +=i;
        }
        System.out.println("1~10之间偶数之和"+sum);
    }
}
