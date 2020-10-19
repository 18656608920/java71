package 多重数组;

import java.util.Arrays;
import java.util.Scanner;

public class work08 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("要删除的名字");
        String name=input.next();
        int j=-1;
        for (int i=0;i<names.length;i++){
            if (name.equalsIgnoreCase(names[i])){
                j=i;
                break;
            }
        }
        System.out.println("j"+j);
        if (j!=-1){
            for (int i=j;j<names.length-1;j++){
                names[i]=names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1]=null;
        }else {
            System.out.println("没有你要删除的名字");
        }
        System.out.println("删除后的姓名");
        for (String item:names){
            System.out.println(item);
        }
        for (int i=0;i<names.length-1;i++){
            System.out.println(names[i]);
        }
    }
}
