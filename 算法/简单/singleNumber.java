class singleNumber {
    public int singleNumber(int[] nums) {
        int a=0;
        for (int n:nums){
            a=a^n;
        }
        return a;
    }
}