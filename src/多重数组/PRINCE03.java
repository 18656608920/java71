package 多重数组;

import java.util.Scanner;

public class PRINCE03 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("输入人员姓名");
        String name =input.next();
        int j =-1;
        for (int i=0;i< names.length;i++){
            if (names[i]==null){
                j=i;
                break;
            }
        }
        System.out.println("J"+j);
        if (j!=-1){
            names[j]=name;
        }else {
            System.out.println("无法添加");
        }
        System.out.println("增加后人员");
        for (String item:names){
            System.out.println(item);
        }
    }
}
