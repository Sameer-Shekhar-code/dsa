package Kadane;

public class kadane {
    public static int kadane(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0; i<arr.length; i++){
            if(sum<0){
                sum = 0;
            }

            sum += arr[i];
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums= {-3,-2,-3};
        int x = kadane(nums);
        int total = 0;
        for(int i=0; i<nums.length; i++){
            total += nums[i];
            nums[i] *= -1;
        }
        int y = kadane(nums);
        System.out.println(y);
        System.out.println(total+y);

//        System.out.println( Math.max(x, (total+y)));
    }
}
