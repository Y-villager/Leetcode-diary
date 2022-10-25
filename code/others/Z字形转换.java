package code.others;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
 * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * @author: yxz
 * @date: 2022年09月06日 7:37
 */
public class Z字形转换 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if(numRows < 2)return s;
        List<StringBuffer> rows = new ArrayList<>();
        StringBuffer  res = new StringBuffer(); // 返回输出结果
        char[] chars = s.toCharArray();
        int flag = -1;
        // 初始化每行
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuffer());
        }
        int i=0;
        for (char c : chars) {
            rows.get(i).append(c);
            // 到Z字形转换转折点是，flag取反 （1，-1）
            if (i==0 || i==numRows-1){
                flag = -flag;
            }
            i += flag;
        }
        for (StringBuffer row: rows){
            res.append(row);
        }
        return res.toString();
    }
}
