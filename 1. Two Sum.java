class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
       int result;
        int temp;
        for (i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i, j};
                }
               
            }
             
        }
     return new int[]{};
    }
};
/*
 result=nums[i]+nums[i+1];
            if(result==target)
            {
                //System.out.println("["+i+", "+i+1+"]");
                continue;
            }
            */
