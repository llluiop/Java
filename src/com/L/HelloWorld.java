package com.L;

public class HelloWorld {
    public static void main(String[] args) {
        String s = "你好\uD835\uDD46";
        int len = s.length();
        int cpCount = s.codePointCount(0, s.length());
        System.out.println(s);
        System.out.println(len);
        System.out.println(cpCount);

    }
}
