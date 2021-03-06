//https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = -1;boolean isFound = false;
	        for(int i=1;i<nums.length;i++){
	            
	            if(nums[i] <= nums[i-1]){
	                
	                if(isFound)return false;
	                else{
	                    isFound = true;
	                    if(i<nums.length-1) {
	                    	if( nums[i+1] > nums[i-1]) {
		                    	nums[i] = nums[i-1];	                    }
		                    else if(nums[i]<= count) return false;
	                    }
	                    
	                }
	            }
	            count = nums[i-1];
	        } 
	        return true;
    }
}

//Approach 2

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count=0;
         for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                count++;
                if(i>0 && nums[i-1]>=nums[i+1])
                {
                    nums[i+1] = nums[i];
                }
            }
            if(count>1)
                return false;
        }
       return true;   
    }
}
