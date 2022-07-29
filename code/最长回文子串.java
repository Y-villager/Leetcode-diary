package code;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * @author: yxz
 * @date: 2022年07月22日 18:04
 */
public class 最长回文子串 {

    // 预处理
    private static String preprocess(){
        String res = "";
        return res;
    }

    // Manacher 算法（马拉车算法）
    private static String longestPalindrome2(String s) {
        String ans = "";
        return ans;
    }

    // 动态规划
    public static String longestPalindrome1(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int[][] dp = new int[n][n];
        int max = 0;
        int begin = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1] !=0)) {
                    dp[i][j] = j - i + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        begin = i;
                    }
                }
            }
        }
        回文子串.printDP(dp);

        return s.substring(begin, max+begin);
    }

    public static void main(String[] args) {
        String s = "babad";

        System.out.println(longestPalindrome2(s));
    }


}
