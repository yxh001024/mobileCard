package com.yxh.mobile.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Arrays;

public class MD5Utils {
    public static String md5Encrypt(String password, int salt) {
        char pw[] = password.toCharArray();
        int length = pw.length;
        for (int i = 0; i < length; i++) {
            pw[i] = (char)(pw[i] + salt);
        }
        String target = new String(pw);
        String md5 = DigestUtils.md5Hex(target);
        return md5;
    }
}
