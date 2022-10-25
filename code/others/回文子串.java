package code.others;

/**
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
 * @author: yxz
 * @date: 2022年07月21日 21:20
 */
public class 回文子串 {

    public static int countSubstrings(String s) {
        // 动态规划法
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int j = 0; j < s.length(); j++) {
            System.out.println(s.charAt(j));
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[j][i] = true;
                    ans++;
                }
                System.out.println(s.charAt(i));
                printDP(dp, j);
            }
            System.out.println();
        }
        return ans;
    }
    public static void printDP(boolean[][] dp, int line){
        for (int j = 0; j < dp[line].length; j++) {
            System.out.print(dp[line][j]+"\t");
        }
        System.out.println("\n");
    }
    public static void printDP(int[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public static void printDP(boolean[][] dp){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        String str= "baab";
        int n = countSubstrings(str);
        System.out.printf("总共包含 %d 个回文子串", n);
    }
}
