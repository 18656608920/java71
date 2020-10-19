package 多重数组;

public class TEST01 { //冒泡排序  升序排列
    public static void main(String[] args) {
        int [] nums = {18,28,8,98,76,1};
        System.out.println("******冒泡排序前*****");
        for (int num :nums){
            System.out.println(num);
        }
        //冒泡排序（升序）
        for (int i = 0;i<nums.length;i++){//轮
            for (int j=0;j<nums.length-1-i;j++){//每一轮比较几次
                //按照规律比较并进行交换，当前面的数字比后面的数字大的时候，执行换位
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序");
        for (int num:nums){
            System.out.println(num);
        }
    }
}

