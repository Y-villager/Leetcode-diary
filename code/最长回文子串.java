package code;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * @author: yxz
 * @date: 2022年07月22日 18:04
 */
public class 最长回文子串 {
    public static String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        int[][] dp = new int[n][n];
        int[][] sub = new int[1][2];
        int max = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1] !=0)) {
                    dp[i][j] = j - i + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        sub[0][0] = i;
                        sub[0][1] = j;
                    }
                }
            }
        }
        回文子串.printDP(dp);
        for (int i = sub[0][0]; i <= sub[0][1]; i++) {
            ans += s.charAt(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}
