package code;

/**
 * 统计n以内的素数个数
 * 素数：只能被1和自身整除的自然数，0、1除外
 *
 * @author: yxz
 * @date: 2022年09月17日 16:50
 */
public class 素数个数统计 {
    public static void main(String[] args) {

    }
    // 1.暴力算法
    public static int bf(int n){
        int count=0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }
    // 判断 2~x-1 之间有没有素数
    // 只选判断到 根号x 即可得出是不是素数
    private static boolean isPrime(int x) {
        for (int i = 2; i * i < x; i++) {
            if (x % 2 == 0){
                return false;
            }
        }
        return true;
    }


}
