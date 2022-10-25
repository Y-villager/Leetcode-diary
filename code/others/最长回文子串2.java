package code.others;

import java.io.StringReader;

/**
 * 解题思路：对于一个子串而言，如果它是回文串，并且长度大于 2，那么将它首尾的两个字母去除之后，它仍然是个回文串。
 * 例如对于字符串 “ababa”，如果我们已经知道 “bab” 是回文串，
 * 那么“ababa” 一定是回文串，这是因为它的首尾两个字母都是 “a”。
 *
 * @author: yxz
 * @date: 2022年09月04日 20:34
 */
public class 最长回文子串2 {

    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        int len = s.length(); // 字符长度
        // 长度==1，直接返回true
        if (len < 2) {
            return s;
        }

        int maxLen = 1; // 最长回文子串长度
        int begin = 0; // 最长回文子串起始下标
        boolean dp[][] = new boolean[len][len];
        char[] chars = s.toCharArray();

        // 初始化：单个字符都是回文子串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        // l+1 ~ r-1
        int tempLen = 0;
        for (int r = 1; r < len; r++) {
            for (int l = 0; l < r; l++) {
                if (chars[r] != chars[l]) {  // 判断区间收尾字符是否相同
                    dp[l][r] = false;   // 不同则，此区间不是回文子串
                } else {
                    if (r - l < 3){ // 长度 为 1或2
                        dp[l][r] = true;
                    }else { // 长度 > 2
                        if (dp[l+1][r-1]){
                            dp[l][r] = dp[l+1][r-1];
                        }
                    }
                }
                // 判断是否是回文子串，并记录回文长度
                if (dp[l][r] && r-l+1>maxLen){
                    maxLen = r - l +1;
                    begin = l;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
