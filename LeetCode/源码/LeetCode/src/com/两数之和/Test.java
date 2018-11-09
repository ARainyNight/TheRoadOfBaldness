package com.两数之和;

/***
 *  ClassName : Test
 *  Author    : lin
 *  Date      : 2018/11/6 21:28    
 *  Remark    : 1
 */

public class Test {
    public static void main(String []args){
          int nums[] = {2,7,11,15};
          int target = 9  ;
          int []temp  = twoSum(nums,target);
          System.out.println(temp[0]+":"+temp[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        int []temp = new int[2];
        for (int i =0 ; i<nums.length; i++){
            for (int j = i+1 ; j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    temp[0] = i ;
                    temp[1] = j ;
                    return temp ;
                }
            }
        }

        return temp ;
    }
}
