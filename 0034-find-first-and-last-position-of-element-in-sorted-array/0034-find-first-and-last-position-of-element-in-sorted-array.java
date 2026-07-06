class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;        
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int start = 0;
        int end = nums.length - 1;
        int i = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] > target) {
                end = mid - 1;
            } 
            else if (nums[mid] < target) {
                start = mid + 1;
            } 
            else {
                i = mid;
                if (isSearchingLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return i;
    }

}