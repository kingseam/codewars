package angmagun;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToSmallest {

    public static long[] smallest(long n) {
        int min = 10;
        int max = 0;
        int idx = 0;
        int min_idx = 0;
        int max_idx = 0;
        for(char ch : String.valueOf(n).toCharArray()){
            if(min > ch-80){
                min = ch-80;
                min_idx = idx;
            }

            if(max < ch-80){
                max = ch-80;
                max_idx = idx;
            }
            idx++;
        }




        return new long[]{1,1,1};
    }
}