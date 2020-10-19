package 多重数组;

public class TEST08 {
    //选择排序
    //定义数组，循环比较 下标为i的元素依次之和的所有元素比较，找到本轮最小（大）的元素
    //交换元素 将最小元素与下标为i的元素交换
    public static void main(String[] args) {
        int[]arr={3,5,1,7,6,9,8};
        int min=-1;//最小值下标

        for (int i=0;i<arr.length-1;i++){//外层循环，比较几轮
            min = i;//每轮min初始值
            for (int j=i+1;j<arr.length;j++){//内存循环，当前元素和后面的元素比较，记录最新的最小元素下标
                if (arr[min]>arr[j]){
                    min =j;
                }
            }
            if (min!=i){//如果min最小值发生变化，说明发现更小的值，则将当前值和更小的值交换，保证跟小值放在前面
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int num:arr){//输出num
            System.out.println(num);
        }
    }
}
