class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        int s=0;
        while(n>0)
        {
            s=n%10;
            sum=sum*10+s;
            n=n/10;
        }
        if(x==sum)
        return true;
        else
        return false;
    }
}
