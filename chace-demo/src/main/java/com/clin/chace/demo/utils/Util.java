package com.clin.chace.demo.utils;

public class Util {

    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        for (int n = num; n > 0 ; n /= 2) {
            sb.append(n %  2);
        }
        return sb.toString();
    }
}
