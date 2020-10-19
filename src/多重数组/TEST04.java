package 多重数组;

import java.util.Arrays;

public class TEST04 {
    public static void main(String[] args) {
        //数组添加新的元素
        String[] oldFruits = {"apple", "peach", "pear", "banana", "grape"};
        String[] newFruits = new String[oldFruits.length + 1];
        //System.arraycopy(原数组，原数组下标，新数组，新数组下标，数组长度)将指定原数组中的数组从指定位置复制
        System.arraycopy(oldFruits, 0, newFruits, 0, oldFruits.length);//复制
        for (int i = 0; i < newFruits.length; i++) {
            if (newFruits[i] == null) {//null为空值
                newFruits[i] = "orange";
                break;
            }
        }
        System.out.println(Arrays.toString(newFruits));

        //合并数组
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
    }
}
