package 二维数组;

public class work02 {
    public static void main(String[] args) {
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int total = total(arr);
        System.out.println("全年的销售额为 :"+ total +"万元 ");
    }
    public static int total(int[][] arr ){
        int sum = 0;
        for ( int x=0; x<arr.length; x++){
            for ( int y=0; y<arr[x].length; y++){
                sum+=arr[x][y];
            }
}
        return sum;
    }
}
