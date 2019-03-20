package angmagun;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stat {

    public static String stat(String strg) {
        int[] sumArrays = separator(strg);
        return "Range: "+range(sumArrays)+" Average: "+average(sumArrays)+" Median: "+median(sumArrays);
    }

    public static int[] separator(String strg){
        String[] splitArrays = strg.split(",");
        int[] sumArrys = new int[splitArrays.length];
        int idx = 0;
        for(String elem : splitArrays){
            System.out.println(elem);
            sumArrys[idx] += Integer.parseInt(elem.split("\\|")[0].trim())*60*60;
            sumArrys[idx] += Integer.parseInt(elem.split("\\|")[1].trim())*60;
            sumArrys[idx] += Integer.parseInt(elem.split("\\|")[2].trim());
            idx++;
        }
        sumArrys = IntStream.of(sumArrys).sorted().toArray();
        return sumArrys;
    }

    public static String average(int[] sumArrys){
        return formatChange(IntStream.of(sumArrys).sum() / (sumArrys.length));
    }

    public static String median(int[] sumArrys){
        int median =  sumArrys.length % 2 != 0 ? sumArrys[((sumArrys.length)/2)] : (sumArrys[((sumArrys.length)/2)] + sumArrys[((sumArrys.length)/2)-1])/2;
        return formatChange(median);
    }

    public static String range(int[] sumArrys){
        return formatChange(sumArrys[sumArrys.length-1] - sumArrys[0]);
    }

    public static String formatChange(int sec){
        String hour = String.valueOf(sec / 3600);
        sec = sec % 3600;
        String minute = String.valueOf(sec / 60);
        sec = sec % 60;
        String second = String.valueOf(sec);

        hour = hour.length() == 1 ? "0"+hour : hour;
        minute = minute.length() == 1 ? "0"+minute : minute;
        second = second.length() == 1 ? "0"+second : second;

        return hour+"|"+minute+"|"+second;
    }
}

