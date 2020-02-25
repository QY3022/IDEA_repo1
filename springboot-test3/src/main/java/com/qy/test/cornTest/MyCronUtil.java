package com.qy.test.cornTest;

import com.google.common.collect.Lists;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/24.
 */
public class MyCronUtil {

    private static final String TRANS_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static final String TRANS_CRON_FORMAT_ONCE = "ss mm HH dd MM ? yyyy";

    private static final String TRANS_CRON_FORMAT_DAY = "ss mm HH dd/ * ? *";

    private static final String TRANS_CRON_FORMAT_WEEK = "ss mm HH ? * -- *";

    private static final String TRANS_CRON_FORMAT_MONTH = "ss mm HH dd MM/1 ? *";

    public static void main(String[] args) throws Exception {
        String result = getCron("day", "2018-08-11 12:11:00");
//       String result = getCron("MON", "2018-08-11 12:11:00");
        // String result = getCronByOnce("2017-01-01 12:12:12");
//       String result = getCron("month", "2019-01-01 12:00:00");
        // String result = getCronToDate("12 12 12 01 01/1 ? 2018");

        System.out.println(result);
        String cronToDate = getCronToDate(result);

        System.out.println(judgeSlash("0/5"));
    }

    /**
     * 生成只执行一次的cron
     */
    public static String getCronByOnce(String dateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(TRANS_DATE_FORMAT);
        Date parse = format.parse(dateStr);
        return fmtDateToStr(parse, TRANS_CRON_FORMAT_ONCE);
    }

    /**
     * 生成每月或每周或每天执行的cron
     */
    public static String getCron(String period, String startDateStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(TRANS_DATE_FORMAT);
        Date startDate = format.parse(startDateStr);
        StringBuffer cronStringBuffer = new StringBuffer();
        if ("month".equals(period)) {
            String startDateCron = fmtDateToStr(startDate, TRANS_CRON_FORMAT_MONTH).trim();
            cronStringBuffer.append(startDateCron);
        } else if ("day".equals(period)) {
            String startDateCron = fmtDateToStr(startDate, TRANS_CRON_FORMAT_DAY).trim();
            // StringBuffer stringBuffer = new StringBuffer(str);
            // stringBuffer.insert(stringBuffer.lastIndexOf("/") + 1, period);
            // cron = stringBuffer.toString().trim();
            // createPeriod(arrStart, arrEnd, 4);
            cronStringBuffer.append(startDateCron).insert(cronStringBuffer.lastIndexOf("/") + 1, "1");
        } else {
            String startDateCron = fmtDateToStr(startDate, TRANS_CRON_FORMAT_WEEK).trim();
            cronStringBuffer.append(startDateCron.replaceAll("--", period));
        }
        return cronStringBuffer.toString();
    }

    public static String getCronToDate(String cron) {
        String[] s = cron.split(" ");  //7位
        String ss = "0";
        String mm = "0";
        String HH = "0";
        String dd = "0";
        String MM = "0";
        String week = "0";
        String year = "0";

        String cycle = "";
        if (null != s && 0 != s.length) {
            //秒
            if(judgeCron(s[0])){
                if(s[0].contains("/")){
                    List<String> list = judgeSlash(s[0]);
                    s[0] = list.get(0);
                    cycle = list.get(1);
                }
                ss = s[0];
            }
            //分
            if(judgeCron(s[1])){
                if(s[1].contains("/")){
                    List<String> list = judgeSlash(s[1]);
                    s[1] = list.get(0);
                    cycle = list.get(1);
                }
                mm = s[1];
            }
            //小时
            if(judgeCron(s[2])){
                if(s[2].contains("/")){
                    List<String> list = judgeSlash(s[2]);
                    s[2] = list.get(0);
                    cycle = list.get(1);
                }
                HH = s[2];
            }
            //日
            if(judgeCron(s[3])){
                if(s[3].contains("/")){
                    List<String> list = judgeSlash(s[3]);
                    s[3] = list.get(0);
                    cycle = list.get(1);
                }
                dd = s[3];
            }
            //月
            if(judgeCron(s[4])){
                if(s[4].contains("/")){
                    List<String> list = judgeSlash(s[4]);
                    s[4] = list.get(0);
                    cycle = list.get(1);
                }
                 MM= s[4];
            }
            //星期
            if(judgeCron(s[5])){
                if(s[5].contains("/")){
                    List<String> list = judgeSlash(s[5]);
                    s[5] = list.get(0);
                    cycle = list.get(1);
                }
                week = s[5];
            }
            //年
            if(judgeCron(s[6])){
                if(s[6].contains("/")){
                    List<String> list = judgeSlash(s[6]);
                    s[6] = list.get(0);
                    cycle = list.get(1);
                }
                year = s[6];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(year).append("-").append(MM).append("-").append(dd).append(" ").
                append(HH).append(":").append(mm).append(":").append("ss");


        return "";
    }

    /**
     * 格式转换 日期-字符串
     */
    public static String fmtDateToStr(Date date, String dtFormat) {
        if (date == null)
            return "";
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dtFormat);
            return dateFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Boolean judgeCron(String str){
        if("0".equals(str) || "*".equals(str) || "?".equals(str)){
            return false;
        }
        return true;
    }

    public static List<String> judgeSlash(String str){
        String str1 = str.substring(0, str.indexOf("/")).replace(" ","").trim();
        String str2 = str.substring(str.indexOf("/")+1,str.length()).replace(" ","").trim();
        List<String> list = Lists.newArrayList();
        list.add(str1);
        list.add(str2);
        return list;
    }

    public static String getCronToList(String cron) {
        String[] s = cron.split(" ");
        return "";
    }
}
