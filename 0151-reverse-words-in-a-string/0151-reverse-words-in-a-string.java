class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] part = s.split("\\s+");
        StringBuilder res =new StringBuilder();
        for(int i=part.length-1;i>=0;i--)
        {
            res.append(part[i]);
            res.append(" ");
        }      
        return (res.toString()).trim(); 
    }
}