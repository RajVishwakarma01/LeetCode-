import java.io.*;
import java.lang.String;
class Solution {
    public int getVal(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;

        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char ch1=s.charAt(i);
            /*
            In This we can check the value of next characters if it is
            greter then we subtract that number and if the next charactor 
            value is small then we add that number
            */
            if((i+1)<n && getVal(ch1) < getVal(s.charAt(i+1)))
            {
                sum=sum-getVal(ch1);
            }
            else
            {
                sum=sum+getVal(ch1);
            }
           
        }
         return sum;
    }
}
