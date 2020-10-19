package 多重循环作业;

public class work03 {
    public static void main(String[] args) {
        for(int i =1;i<=3;i++) {
            for(int j=2;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            for(int l=2;l>=i;l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
