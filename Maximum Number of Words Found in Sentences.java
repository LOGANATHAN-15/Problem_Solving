class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String cu:sentences)
        {
            int cl=cu.split(" ").length;
            if(max<cl)  max=cl;
        }
        return max;
    }
}