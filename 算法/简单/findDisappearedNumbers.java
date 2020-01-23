class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap <Integer,Boolean> had=new HashMap<Integer,Boolean>();
        for (int i=0;i<nums.length;i++){
            had.put(nums[i],true);
        }
        List <Integer> missing =new LinkedList<Integer>();
        
                for (int i = 1; i <= nums.length; i++) {
            if (!had.containsKey(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}