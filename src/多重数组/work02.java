package 多重数组;

public class work02 {
    public static void main(String[] args) {
        int []num={8,7,3,9,5,4,1};
        int max = num[0];
        int index = 0;
        for (int i =0;i<num.length;i++){
            if (num[i]>max){
               max=num[i];
               index = i;
            }
        }
        System.out.println("最大值为"+max+"下标为"+index);
    }
}
