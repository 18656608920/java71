package 多重数组;

import java.util.Scanner;

public class work09 {
    public static void main(String[] args) {
        boolean a = false;
        String []names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("输入要修改的值");
        String name =input.next();
        for (int i=0;i<names.length;i++){
            if (names[i]==name){
                a=true;
                System.out.println("存在修改为");
                names[i]=input.next();
                System.out.println("修改的下标为："+i+"数据改为改成"+names[i]);
            }
        }
        if(a==false){
            System.out.println("不存在");
    }
        for(int i=0;i<5;i++){
            System.out.print(names[i]+" ");
}
    }
}
