package 多重数组;

import java.util.Arrays;
import java.util.Scanner;

public class TEST06 {
    //java中的数组删除
    public static void main(String[] args) {
        String[] names={"tom","jack","sam","alice","ruby","robin"};
        Scanner input =new Scanner(System.in);
        System.out.println("输入删除人员姓名");
        String name =input.next();
        int j=-1;
        for (int i=0;i<names.length;i++){
            if (name.equalsIgnoreCase(names[i])){
                j=i;
                break;
            }
        }
        System.out.println("j="+j);
        if (j!=-1){
            for (int i=j;i<names.length-1;i++){
                names[i]=names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1]=null;
        }else {
            System.out.println("抱歉，没有您要删除的名字");
        }
        System.out.println("删除后人员姓名是");
        for (String item:names){
            System.out.print(item+"\t");
        }
        for (int i=0;i<names.length-1;i++){
            System.out.println(names[i]);
        }
    }
}
