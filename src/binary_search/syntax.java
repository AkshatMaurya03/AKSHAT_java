package binary_search;

public class syntax {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,7};
        int ans=binary(nums,4 );
        System.out.println(ans);

    }
    static int binary(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start <= end)
        {
            int mid=start + (end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else return mid;

        }
        return -1;


    }
}
