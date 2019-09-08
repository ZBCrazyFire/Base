package com.xxx.common;

import com.xxx.common.utils.DateUtils;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        String dateString = "2019-09-08";
        String pattern = DateUtils.YYYY_MM_DD;
        Date date = DateUtils.stringToDate(dateString, pattern);
        String dateString1 = DateUtils.dateToString(date, pattern);
        System.out.println(date);
        System.out.println(dateString1);
    }
}
