package 多重循环作业;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "admin";
        int password = 123456;
        for (int i =3;i>=1;i--){
            System.out.println("输入用户名");
            String name = input.next();
            System.out.println("输入密码");
            int pw = input.nextByte();
            if (name.equals(username) && pw==password){
                System.out.println("登陆成功，欢迎进入二次元系统");
                break;
            }else if (i!=1){
                System.out.println("用户名密码错误");
                System.out.println("你还有"+(i-1)+"次机会，请重新输入");
            }else {
                System.out.println("您没有权限进入");
            }
        }

    }
}
