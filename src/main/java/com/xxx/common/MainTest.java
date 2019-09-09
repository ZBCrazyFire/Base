package com.xxx.common;

import com.xxx.common.utils.DateUtils;
import com.xxx.common.utils.EncryptUtils;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        String aa = "aaaaa";
        System.out.println(EncryptUtils.getMD5(aa));
        System.out.println(EncryptUtils.getSha256(aa));
    }
}
