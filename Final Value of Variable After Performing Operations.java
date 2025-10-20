class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int l=operations.length;
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(operations[i].equals("--X")||operations[i].equals("X--"))
            {
                c--;
            }
            else
            {
                c++;
            }
        }
        return c;
        
    }
}