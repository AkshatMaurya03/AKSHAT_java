package binary_search;

import java.util.Arrays;

public class findFirstAndLastIndexOfTarget {
    public static void main(String[] args) {
        int[] nums = {5,6,7,7,7,7,8,9};
        int target=7;
        int[] ans =question(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] question(int[] nums , int target)
    {
        int[] ans={-1,-1};
        int first=search(nums,target,true);
        int last= search(nums ,target , false);
        ans[0]=first;
        ans[1]=last;
        return ans;

    }
    static int search(int[] nums, int target, boolean findFirstIndex)
    {
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid=start +(end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else {
                ans=mid;
                if(findFirstIndex) {
                    end = mid - 1;
                }
                else {
                    start=mid+1;
                }
            }

        }
        return ans;

    }
}
