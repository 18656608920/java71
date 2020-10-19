package 多重数组;

public class PRICE01 {
    public static void main(String[] args) {
        int[] nums = {10,34,8,90,67,34};
        System.out.println("******排序前******");
        for (int num:nums){
            System.out.println(num);
        }
        for (int i=0;i<nums.length;i++){
            for (int j= 0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("排序后");
        for (int num:nums){
            System.out.println(num);
        }
    }
}
