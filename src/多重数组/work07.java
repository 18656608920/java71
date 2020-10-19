package 多重数组;

import java.util.Arrays;
//int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重
public class work07 {
    public static void main(String[] args) {
        int []num1={1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        int []num2=new int[0];
        boolean isRepeat = false;
        int index=0;
        for (int i=0;i<num1.length;i++){
            isRepeat =false;
            for (int j=i+1;j<num1.length;j++){
                if (num1[i]==num1[j]){
                    isRepeat =true;
                    break;
                }
            }
            if (!isRepeat){
                num2 = Arrays.copyOf(num2,num2.length+1);
                num2[index++]=num1[i];
            
            }
        }
        System.out.println(Arrays.toString(num2));
    }
}
