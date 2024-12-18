package binary_search;

import java.util.Scanner;

public class ceiling {
    //number that is equal to or greater than the target number
    public static void main(String[] args) {
        int[] nums={11,34,56,67,78,89};
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int ans=binary(nums, target);
        System.out.println(ans);

    }
    static int binary(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start <= end)
        {
            int mid=start + (end-start)/2;
            if(target>nums[mid])
                start=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else return mid;

        }
        return start ;


    }
}
