class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int a[] =new int [n];
        
        for(int i=0;i<n;i++)
        {   int d=0;
            for(int j=i+1;j<n;j++)
            {
                if(prices[j]<=prices[i])
                {
                    d=prices[j];
                    break;
                }
            }
            a[i]=prices[i]-d;
        }
        return a;
    }
}