package com.qy.utils;

import com.qy.utils.constants.Constants;
import com.qy.exception.ApiException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CronUtil {

    /**
     * 生成cron表达式
     * @param cronStr  (类型:1月,2周,3日,4时)  1:月日时分  2.周时分  3.时分  4.几点-几点每隔几小时
     * @return
     * @throws Exception
     */
    public static String getCronByCronValue(String cronStr) throws Exception{
        try {
            String[] s = cronStr.split(",");
            int type = Integer.valueOf(s[0]).intValue();
            if (type == 1) {
                String[] time = getHourAndMinute(s[2]);
                return String.format("0 %s %s %s * ? *", time[1], time[0], s[1]);////0 21 15 3 * ? *
            } else if (type == 2) {
                String[] time = getHourAndMinute(s[2]);
                return String.format("0 %s %s ? 1-12 %s *", time[1], time[0], s[1]);////0 21 16 ? 1-12 4 *
            } else if (type == 3) {
                String[] time = getHourAndMinute(s[1]);
                return String.format("0 %s %s * * ? *", time[1], time[0]);////0 21 16 * * ? *
            } else if (type == 4) {
                String[] stime = getHourAndMinute(s[1]);
                String[] etime = getHourAndMinute(s[3]);
                String timeS = getCycle(s[1], Integer.valueOf(s[2]).intValue(), s[3]);////0 21 0,3,6,7,16,17 * * ? *
                return String.format("0 %s %s * * ? *", stime[1], timeS);
            } else {
                log.error("cron类型错误:{}",cronStr);
                throw new ApiException(Constants.REQUEST_ERROR,"cron类型错误!请选择正确的运行周期.");
            }
        }catch (Exception e){
            e.printStackTrace();
            log.error("cron表达式参数错误:{}",cronStr);
            throw new ApiException(Constants.REQUEST_ERROR,"cron表达式参数错误!请选择正确的运行周期.");
        }
    }

    public static String[] getHourAndMinute(String s) throws Exception{
        return s.split(":");
    }

    public static String[] getArr(String s) throws Exception{
        return s.split(",");
    }

    public static String getCycle(String sTime,int cycle,String endTime) throws Exception{
        String[] sArr = getHourAndMinute(sTime);
        String[] eArr = getHourAndMinute(endTime);
        int eHour = Integer.valueOf(eArr[0]).intValue();
        if(Integer.valueOf(sArr[1]).intValue() > Integer.valueOf(eArr[1]).intValue())
            eHour = eHour-1;
        String runStr = "";
        for(int i=Integer.valueOf(sArr[0]).intValue();i<24;i=i+cycle){
          if(i>eHour)
              break;
          if(runStr.length()==0){
              runStr = String.valueOf(i);
          }else{
              runStr += ","+String.valueOf(i);
          }
        }
        return runStr;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getCronByCronValue("4,6:15,2,23:18"));
            System.out.println(getCronByCronValue("4,6:15,2,20:11"));
            System.out.println(getCronByCronValue("1,3,6:15"));
            System.out.println(getCronByCronValue("1,L,6:15"));
            System.out.println(getCronByCronValue("2,4,6:15"));
            System.out.println(getCronByCronValue("3,6:15"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
