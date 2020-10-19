package 多重循环作业;

public class TEST07 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}
