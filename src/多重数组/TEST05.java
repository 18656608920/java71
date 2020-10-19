package 多重数组;

import java.util.Scanner;

public class TEST05 {
    //java中的增加
    public static void main(String[] args) {
        String[] names={"tom","jack","sam","alice",null,"ruby","robin"};
        Scanner input =new Scanner(System.in);
        System.out.println("输入人员姓名");
        String name =input.next();
        int j=-1;
        for (int i=0;i<names.length;i++){
            if (names[i]==null){
                j=i;
                break;
            }
        }
        System.out.println("j="+j);
        if (j!=-1){
            names[j]=name;
        }else {
            System.out.println("无法添加");
        }
        System.out.print("增加后的人员姓名");
        for (String item:names){
            System.out.println(item+"\t");
        }
    }
}
