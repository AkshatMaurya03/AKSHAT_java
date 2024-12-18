package arrays_ak;

import java.util.Arrays;

/*QUESTION::Given a zero-based permutation nums (0-indexed),
 build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/
public class array_for_permutation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,12,34,65};
        System.out.println(Arrays.toString(buildArray(arr)));

    }
        static int[] buildArray(int[] nums) {
            int[] ans= new int[nums.length];
            for(int i=0 ; i<nums.length; i++)
            {
                ans[i]=nums[nums[i]];
            }
            return ans;
        }
    }

