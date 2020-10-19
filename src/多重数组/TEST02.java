package 多重数组;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TEST02 {
    //倒置数组元素
    public static void main(String[] args) {
        int [] arr={7,1,5,2};
        int i =0;//定义数组第一个元素下标
        int j =arr.length-1;
        int temp =0;
        while (i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;//交换数组最后一个数
            j--;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
