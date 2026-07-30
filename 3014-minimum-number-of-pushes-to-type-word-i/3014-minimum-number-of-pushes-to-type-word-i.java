class Solution {
    public int minimumPushes(String word) {
        int count = word.length();
        if(count <= 8)
        {
            return count;
        }
        else if(count >8 && count <=16)
        {
            return 8 + ((count-8)*2);
    }
    else if(count >16 && count <=24)
        {
            return 24+ ((count-16)*3);
    }
    else 
    {
        return 8+ 16 +24+((count -24)*4);
    }
   
}
}