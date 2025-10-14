class Solution {
    public static boolean chkincreasing(int st,int end ,List<Integer>nums)
    {
        for(int i=st+1;i<=end;i++)
        {
            if(nums.get(i-1)>=nums.get(i))return false;
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i<=n-k;i++)
        {
            if(i+k<n && i+(2*k)<=n && chkincreasing(i,i+k-1,nums) && chkincreasing(i+k,i+(2*k)-1,nums))return true;
        }
        return false;
        
    }
}