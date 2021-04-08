package com.quanxi.qxdbapiv2.qxcommon.util;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    //日期类型
    public static final int YEAR = 1;
    public static final int MONTH = 2;
    public static final int DATE = 3;

    /**
     * 获取当前系统时间
     * @return 默认格式：yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrSysTime() {
        String format = "yyyy-MM-dd HH:mm:ss";
        return getCurrSysTime(format);
    }

    /**
     * 获取当前系统时间
     * @param format 时间格式
     * @return
     */
    public static String getCurrSysTime(String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);//设置日期格式
        return df.format(new Date());   // new Date()为获取当前系统时间
    }

    /**
     * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss
     * @param date 时间
     * @return 时间字符串
     */
    public static String dateTimeToStr(Date date) {
        return dateTimeToStr(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss
     * @param date 时间
     * @param format 格式
     * @return 时间字符串
     */
    public static String dateTimeToStr(Date date, String format) {
        if (null == date) {
            return null;
        }

        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 将长时间格式符串转换为时间，默认格式 yyyy-MM-dd HH:mm:ss
     * @param str 长时间格式符串
     * @return 时间
     */
    public static Date strToDateTime(String str) {
        return strToDateTime(str, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 将长时间格式字符串转换为时间
     * @param str 长时间格式符串
     * @param format 格式
     * @return 时间
     */
    public static Date strToDateTime(String str, String format) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(str);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }

    /**
     * 将长时间格式符串转换为Timestamp时间格式
     * @param str
     * @return Timestamp
     */
    public static Timestamp strToDateTimestamp(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        Date dt = DateTimeUtil.strToDateTime(str);
        return new Timestamp(dt.getTime());
    }

    /**
     * 比较两个时间相差的天数、月数、年数
     * @param startDate  开始时间
     * @param endDate    结束时间
     * @param type     比较类型：天、月、年
     * @return          返回相差的天数、月数或年数
     */
    public static int compareDate(String startDate, String endDate, int type){
        int n = 0;
        String formatStyle = type == 1 ? "yyyy-MM" : "yyyy-MM-dd";

        DateFormat df = new SimpleDateFormat(formatStyle);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        try {
            c1.setTime(df.parse(startDate));
            c2.setTime(df.parse(endDate));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        while (!c1.after(c2)) {                   // 循环对比，直到相等，n 就是所要的结果
            n++;
            if (type == DateTimeUtil.MONTH){
                c1.add(Calendar.MONTH, 1);          // 比较月份，月份+1
            }
            else{
                c1.add(Calendar.DATE, 1);           // 比较天数，日期+1
            }
        }
        n = n - 1;
        if (type == DateTimeUtil.YEAR){
            n = (int)n / 365;
        }
        return n;
    }

}
