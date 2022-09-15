package code.腾旭精选50;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年09月06日 10:59
 */
public class 字符串转换整数_8 {
    public static void main(String[] args) {
        String str1 = "321";
        String str2 = "  sad-321 sa";
        System.out.println(myAtoi(str1));
        System.out.println(myAtoi(str2));
    }
    public static int myAtoi(String s) {
        // 1. 去除前置空格
        s = s.stripLeading();
        System.out.println(s);
        // 读取 + - 符号
        int a = s.indexOf("-");
        int b = s.indexOf("+");

        return 0;
    }
}
