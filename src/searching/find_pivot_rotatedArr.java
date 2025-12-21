package searching;

public class find_pivot_rotatedArr {
    public static void main(String[] args) {
        int[] arr={11, 13, 15, 17};
        System.out.println(pivot(arr));
    }
    public static int pivot(int[] nums){
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
