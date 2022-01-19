// https://leetcode.com/problems/two-sum/solution/

//Brute Force Approach
// TC - O(n^2) (For each element, we try to find its complement by looping through the rest of the array which takes O(n) time)
// SC - O(1) since does not depend on size of input array, thus constant 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        for (int i=0; i<l; i++) {
            for (int j=i+1; j<l; j++) {
                if (nums[j] == (target - nums[i])) 
                    return new int[] {i,j};
            }
        }
        return null;
    }
}

//Two Pass Hash Table Code
//One Pass Hash Table Code
