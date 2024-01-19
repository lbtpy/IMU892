package Imu892_2017;

//经历的天数
public class Days {
    public static void main(String[] args) {
        String oldDay = "1999年6月6日";
        String newOlday = "2021年12月12日";
        System.out.print(countDays(oldDay,newOlday));
    }
    public static boolean isRunNian( int years){
        boolean flag = false;
        if( years % 400 == 0){
            flag = true;
        }
        return flag;
    }
    public static int countDays(String oldDate, String newDate){
        String regex = "\\D+";
        String[] oldarr = oldDate.split(regex);
        String[] newarr = newDate.split(regex);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sumdays = 0;
        int year = 365;
        int oldyears = Integer.parseInt(oldarr[0]);
        int oldmonths = Integer.parseInt(oldarr[1]);
        int olddays = Integer.parseInt(oldarr[2]);
        int newyears = Integer.parseInt(newarr[0]);
        int newmonths = Integer.parseInt(newarr[1]);
        int newdays = Integer.parseInt(newarr[2]);
        for(int i = oldyears; i <= newyears; i++){
            if(isRunNian(i)){
                days[1] = 29;
                year = 365;
            }
            if(i == oldyears){
                sumdays = days[oldmonths-1]-olddays-1;
                for (int j= oldmonths; j < 12; j++){
                    sumdays+=days[j];
                }
            }
            else if(i == newyears){
                for (int j= 0; j < newmonths-1; j++){
                    sumdays+=days[j];
                }
                sumdays+=newdays;
            }
            else {
                sumdays+=year;
            }
        }
        return sumdays;
    }
}


