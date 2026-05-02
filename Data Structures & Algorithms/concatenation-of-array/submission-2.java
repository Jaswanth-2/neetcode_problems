class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length==0) return nums;
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){    
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr;
    }
}