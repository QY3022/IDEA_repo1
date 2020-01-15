package com.qy.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.expression.ParseException;
import org.springframework.scheduling.support.CronSequenceGenerator;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author QY3022
 * @date 2020/1/15
 */
public class DateUtil {
    /**
     * @param cron 表达式
     * @param time 指定次数
     * @return
     * @desc 计算表达式近指定次数执行时间
     */
    public static List<String> seeExcuteTime(String cron, int time) throws ParseException, IllegalArgumentException {
        if (StringUtils.isEmpty(cron)) {
            throw new IllegalArgumentException("参数不能为空");
        }
        CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator(cron);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<String> list = new ArrayList<>(time);
        Date nextTimePoint = new Date();
        for (int i = 0; i < time; i++) {
            nextTimePoint = cronSequenceGenerator.next(nextTimePoint);
            list.add(sdf.format(nextTimePoint));
        }
        return list;
    }

    /**
     * 得到几天前的时间* 
     *
     * @param d
     * @param day
     * @return
     */
    public static Date getDateBefore(Date d, int day) {
        Calendar no = Calendar.getInstance();
        no.setTime(d);
        no.set(Calendar.DATE, no.get(Calendar.DATE) - day);
        return no.getTime();
    }

    public static Date getDateNoTime() {
        try {
            Date statisticsDate = new Date();
            //String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            //return LocalDateTime.parse(format);//localDateTime
            return statisticsDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStatisticsBatchId() {
        try {
            Date statisticsDate = new Date();
            LocalDateTime localDateTime = statisticsDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            return format;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStatisticsBatchId(Date d) {
        try {
            LocalDateTime localDateTime = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            return format;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date getDateFromBatchId(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date getLastWeekSunday(Calendar date) {
        if (date == null) {
            date = Calendar.getInstance(Locale.CHINA);
        }
        date.setFirstDayOfWeek(Calendar.MONDAY);
        date.add(Calendar.WEEK_OF_MONTH, -1);
        date.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return date.getTime();
    }

    /**
     * 仅仅适合数据统计取上一周日使用,请不要乱改动这个代码
     *
     * @return
     */
    public static String getLashSunday() {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        //逻辑正确
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            date = getDateBefore(date, 3);
        }
        calendar.setTime(date);
        date = getLastWeekSunday(calendar);
        return getStatisticsBatchId(date);
    }

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear() + "" + localDateTime.getMonthValue() + "" + localDateTime.getDayOfMonth());
        System.out.println(getStatisticsBatchId());

        Date date = getLastWeekSunday(null);
        System.out.println(date);

        Date date1 = getDateFromBatchId("20191206");
        System.out.println(date1);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.SUNDAY);
        System.out.println(Calendar.MONDAY);
        System.out.println(getLashSunday());
    }
}
