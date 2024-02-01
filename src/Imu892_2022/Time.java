package Imu892_2022;

import java.util.Arrays;

public class Time {
    public static void main(String[] args) {
        long curtime = System.currentTimeMillis()/1000;
        System.out.println(curtime+"秒");
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        int rYearTime = 366 * 86400;
        int pYearTime = 365 * 86400;
        int year;
        //算年
        for (year = 1970; year < 2050; year++) {
            //闰年判断
            if (year%4 ==0 && year%100 !=0 || year%400 == 0) {
                if(curtime >= rYearTime ) {
                    curtime -= 366 * 86400;
                }else {
                    break;
                }
            } else {
                if(curtime >= pYearTime) {
                    curtime -= 365 * 86400;
                }else {
                    break;
                }
            }
        }
        System.out.println(year);

        //算月
        if(year%4 ==0 && year%100 !=0 || year%400 == 0) {
            month[1] = 29;
        }
        System.out.println(Arrays.toString(month));
        int j;
        for ( j = 1; j <= 12; j++) {
            if(curtime > (long) month[j - 1] * 86400){
                curtime -= (long) month[j - 1] * 86400;
            }else {
                break;
            }
        }
        String nowMonthStr = String.format("%02d",j);

        //算日
        long nowDay = curtime / 86400 + 1;
        String nowDayStr = String.format("%02d",nowDay);

        //当天剩余的时间 -- 秒
        long surplusSecs = curtime % 86400;

        //算小时
        long nowHour = surplusSecs / 3600 + 8;

        //剩余的分钟
        surplusSecs %= 3600;

        //算分钟
        long nowMin = surplusSecs /60;
        String nowMinStr = String.format("%02d", nowMin);

        //算秒
        surplusSecs = surplusSecs % 60;

        //输出结果
        System.out.println("当前时间为：" + year + "-" + nowMonthStr+"-"+nowDayStr+" "+nowHour+":"+nowMinStr+":"+surplusSecs);
    }
}
