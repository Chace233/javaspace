package com.clin.chace.demo.logic.string;

/**
 * 解题思路： 动态规划
 * 首先确定最简单的判定条件：
 *      1、如果s1或者s2其中一个为null，则直接返回false
 *      2、如果s1的长度和s2的长度不一样，则直接返回false
 *      3、如果s1与s2相等，则返回true
 * 其次判断s1和s2中的字符数量是否一致
 * 最后根据动态规划，将s1和s2切分成两部分子字符串，分别比较两个子字符串：
 *      1、比较s1[0, i] == s2[0, i] && s1[i, length - 1] == s2[i, length - 1] (s1左边==s2左边 && s1右边==s2右边)
 *      2、比较s1[0, i] == s2[length - i, length - 1] && s1[i, length - 1] == s2[0, length - i] （s1左边==s2右边 && s1右边==s2左边）
 */
public class ScrambleString {

    public static boolean isScramble(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;

        int[] letters = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }

        for (int i = 1; i < s1.length(); i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
                return true;
            }
            if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "caebd";
        System.out.println(ScrambleString.isScramble(s1, s2));
    }
}
