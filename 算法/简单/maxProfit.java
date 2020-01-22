class maxProfit {
    public int maxProfit(int[] prices) {
        int max=0;int pro=0;
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                pro=prices[j]-prices[i];
                if (pro>max ){
                    max=pro;
                }
            }
        }
        if (max>0){
        return max;
        }
        else return 0;
    }
}