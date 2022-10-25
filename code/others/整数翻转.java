package code.others;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 *
 * @author: yxz
 * @date: 2022年09月06日 9:46
 */
public class 整数翻转 {
    public static void main(String[] args) {
        int num = -590;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        int flag = 1;
        if (x < 0){
            flag = -flag;
            x = -x;
        }
        int res = 0;
        int last = 0;
        while(x>0){
            int temp = x % 10;  // 取个位
            last = res;
            res = res*10+temp;
            if (last != res / 10){
                return 0;
            }
            x /= 10;    // 去个位
        }
        return res*flag;
    }

}
