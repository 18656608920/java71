package 多重数组;

import java.util.Arrays;

public class work05 {
    public static void main(String[] args) {
        char[] chars={'a','c','u','b','e','p','f','z'};
        Arrays.sort(chars);
        int index = Arrays.binarySearch(chars,'e');
        System.out.println("下标为"+index);
    }
}
