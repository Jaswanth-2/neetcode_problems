class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length==0) return nums;
        int arr[]=new int[nums.length+nums.length];
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                arr[k]=nums[j];
                k++;
            }
        }
        return arr;
    }
}