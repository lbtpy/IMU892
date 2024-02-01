package Imu892_2022;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//时间戳
public class UnixTime {
    public static void entrance() throws ParseException {
        unixTime();
    }
    public static void unixTime() throws ParseException {
        //获取当前系统时间
        Date currenTime = new Date();
        System.out.println("当前系统时间：" + date2String(currenTime));

        //获取当前系统时间戳
        long currenTimestamp = System.currentTimeMillis();
        System.out.println("当前系统时间戳：" + currenTimestamp);

        //时间转换为时间戳
        Date date = new Date();
        long timestamp = date2Timestamp(date);
        System.out.println("时间转换为时间戳：" + timestamp);

        //时间戳转换为时间
        timestamp = System.currentTimeMillis();
        date = timestamp2Date(timestamp);
        System.out.println("时间戳转换为时间：" + date2String(date));

        //日期时间转换为字符串
        date = new Date();
        String strDate = date2String(date);
        System.out.println("日期时间转换为字符串:" + date2String(date));

        //字符转换为日期时间
        strDate = "2023-01-29 22:51:29.235";
        date = string2Date(strDate);
        System.out.println("字符转换为日期时间:" + date2String(date));

        //日期时间相减差值(秒)
        Date date1 = string2Date("2023-01-29 22:51:29.235");
        Date date2 = string2Date("2023-01-29 22:51:29.238");
        double sec = DateSubtraction(date1,date2);
        System.out.println("日期时间相减差值(秒):" + sec + "秒");

        //日期时间增加指定天数
        date = string2Date("2023-01-29 22:51:29.235");
        Date newDate = addDay(date,1);
        System.out.println("日期时间增加指定天数" + date2String(newDate));

    }
    //时间转换为时间
    private static long date2Timestamp(Date date){
        return date.getTime();
    }

    //时间戳转换为时间
    private static Date timestamp2Date(long timestamp){
        return new Date(timestamp);
    }

    //日期转换为字符串
    private static String date2String(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return simpleDateFormat.format(date);
    }

    //字符串转换为日期
    private static Date string2Date(String strDate) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return simpleDateFormat.parse(strDate);
    }

    //日期时间相减差值
    private static double DateSubtraction(Date a, Date b){
        return (a.getTime() - b.getTime());
    }

    //日期时间增加指定天数
    private static Date addDay(Date date, int day){
        return new Date(date.getTime() + 1000 * 3600 * 24 * day);
    }

}
