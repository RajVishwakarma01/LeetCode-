class Solution {
    public int removeDuplicates(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[j]!=nums[i])
          {
              nums[++j]=nums[i];
          }
      }
      return j+1;
    }
}
/*
mis


class demo
{

	public static void main(String ar[])
	{
		int nums [] = {0,0,1,1,1,2,2,3,3,4};
		int n=nums.length;
		int n1=nums.length;
		int x=nums[0];
		int i;
		for(i=0;i<n;i++)
		{
			if(nums[i]==nums[i+1])
			{
				int j;
				for(j=i+1;j<n-1;j++)
				{
					nums[j]=nums[j+1];
				}
				n--;
			}
		}
			System.out.println(n1-n);
		for(int k=0;k<n;k++)
		{
			System.out.println(k);
		}
	}
}

*/
