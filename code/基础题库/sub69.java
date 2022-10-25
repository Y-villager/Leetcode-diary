package code.基础题库;

/**
 * x 的平方根
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 *
 * @author: yxz
 * @date: 2022年10月17日 21:36
 */
public class sub69 {
    public static void main(String[] args) {
        int n = 114514;
        System.out.println(Math.pow(n, 0.5));
        System.out.println(mySqrt(n));
        System.out.println(mySqrt2(n));
    }

    // 方法二：二分查找
    private static int mySqrt2(int x) {
        if (x == 0 || x == 1) return x;
        int l = 0, r = x / 2;
        while (l < r) {
            int mid = l + (r - l+1) / 2;
            if (mid > x/mid) {
                r = mid -1;
            } else {
                l = mid;
            }
        }
        return l;
    }

    // 方法一：袖珍计算器算法
    public static int mySqrt(int x) {
        if (x == 0) {
            return x;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
//        return  (ans+1)*(ans+1)<=x?ans+1:ans;
        return ans;
    }
}
