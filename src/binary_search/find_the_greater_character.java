package binary_search;

import java.util.Scanner;

public class find_the_greater_character {
    public static void main(String[] args) {
        char[] arr={'a','b','c'};
        Scanner in=new Scanner(System.in);
       char ch=in.next().charAt(0);
        char ans=ques(arr, ch);
        System.out.println(ans);
    }
    static char ques(char[] arr , char ch){
        int start=0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ch<arr[mid])
                end=mid-1;
            else start=mid+1;

        }
        return arr[start % arr.length];
    }
}
