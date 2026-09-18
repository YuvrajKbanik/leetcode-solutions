class Solution {
    public String intToRoman(int num) {
        String res="";
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int val[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        while (num!=0)
        {
            
            for(int i=0;i<val.length;i++)
            {
                if(val[i]<=num)
                {
                    num=num-val[i];
                    res+=s[i];
                    break;
                }
            }
        }
        return res;
    }
}