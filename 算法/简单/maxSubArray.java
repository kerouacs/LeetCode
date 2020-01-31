class maxSubArray {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int sum=0;
        for(int n:nums){
            if(sum<0){
                sum=n;
            }
            else{
                sum+=n;
            }
            result=Math.max(sum,result);
        }
        return result;
    }
}