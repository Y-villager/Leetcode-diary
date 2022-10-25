package code.others;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年07月20日 23:26
 */
public class 二分查找 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE -1;
        int b=4;
        int c = (a+b)/2; // a/2+b/2 --> a- (a-b)/2
        int d = a - (a-b)/2;
        System.out.println(c);
        System.out.println(d);
        System.out.println((a+b)>>>1);

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -99;
        int res = search(nums, target);
        System.out.println(res);
        int i = Arrays.binarySearch(nums, target);
        System.out.println(i);

    }

    /**
     * 二分查找 数组下标，先取中间值（前提：有序数组；数组元素不重复）
     * 目标值 == 中间值，取此时中间值下标
     * 目标值 > 中间值，则说明目标在中间值右边
     * 目标值 < 中间值，则说明目标在中间值左边
     */
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 取有序数组中间值
            int mid = left + (right-left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid-1 ;
            }
        }
        return left;
    }
}
