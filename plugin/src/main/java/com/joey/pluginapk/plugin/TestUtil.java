package com.joey.pluginapk.plugin;

import com.joey.pluginapk.library.TestInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件描述
 * Date: 16/8/3
 *
 * @author xusheng
 */
public class TestUtil implements TestInterface {

    /**
     * 将时间戳转换成日期
     *
     * @param dateFormat 日期格式
     * @param timeStamp  时间戳,单位为ms
     */
    public String getDateFromTimeStamp(String dateFormat, long timeStamp) {
        DateFormat format = new SimpleDateFormat(dateFormat);
        Date date = new Date(timeStamp);
        return format.format(date);
    }
}
