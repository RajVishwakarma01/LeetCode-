class Solution {
    public String ss(String s1, String s2)
	{
		int n1;
			String Common = "";
			if(s1.length()<s2.length())
			n1=s1.length();
			else
			n1=s2.length();
			int a;
			for(a=0;a<n1;a++)
			{
			
			if(s1.charAt(a)==s2.charAt(a))
			{
				Common+=s1.charAt(a);
				
			}
            else
            break;
			}
			return Common;
		}
		
    public String longestCommonPrefix(String[] ar) {
        	Solution s = new Solution();
	String result = ar[0];
	int i;
		for(i=1;i<ar.length;i++)
		{
			result=s.ss(result,ar[i]);
		}
	
				return result;
    }
}
