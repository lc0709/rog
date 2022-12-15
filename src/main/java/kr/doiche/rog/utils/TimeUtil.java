package kr.doiche.rog.utils;

public class TimeUtil {
    public static final int SECOND = 20;
    public static final int MINUTE = 60 * SECOND;

    public static int seconds(int sec){
        return SECOND * sec;
    }
    public static int minutes(int min){
        return MINUTE * min;
    }

}
