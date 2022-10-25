package code.others;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 *
 * @author: yxz
 * @date: 2022年07月21日 12:14
 */
public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        // 返回两数 的下标数组
        int index[] = new int[2];
        HashMap<Integer, Integer> map =  new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 目标 - 当前数 的 差
            int temp = target - nums[i];
            // 查看集合是否包含 差，如果有则可以直接返回下标
            if (map.containsKey(temp)){
                index[1] = i;   // 当前数 下标
                index[0] = map.get(temp);   // 差值下标
            }
            // 将当前数放入集合
            map.put(nums[i], i);

        }
        return index;
    }

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
        int[] nums = {2,2,2};
        int target = 4;
        int index[] = twoSum(nums, target);
        for (int i:index) {
            System.out.println(i);
        }
    }
}
