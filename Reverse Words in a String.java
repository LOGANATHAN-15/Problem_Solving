class Solution {
    public String reverseWords(String s) {
        String [] words= s.trim().split("\\s+");
        StringBuilder r=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {    r.append(words[i]);
            if(i!=0) r.append(" ");
        }
        return r.toString();
    }
}