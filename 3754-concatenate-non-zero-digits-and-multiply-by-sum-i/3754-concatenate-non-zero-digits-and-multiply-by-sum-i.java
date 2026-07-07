import java.util.*;
class Solution {
    public long sumAndMultiply(int n) {
        int r=0;
        int i=0;
        long x=0;
        int multiplier=1;
        long sum=0;
        while (n!=0)
        {
            r=n%10;
            if(r!=0)
            {
            x=x+r*multiplier ;
            i++;
            sum+=r;
            multiplier*=10;
            }
            n=n/10;
        }
        return x*sum;


    }
}