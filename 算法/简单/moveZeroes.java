class moveZeroes{
    public void moveZeroes(int[] nums) {
        int lastzero=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[lastzero++]=nums[i];
            }
        }
        for (int i=lastzero;i<nums.length;i++){
            nums[i]=0;
        }
    }
}