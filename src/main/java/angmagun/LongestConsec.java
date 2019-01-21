package angmagun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length < k || k <= 0){
            return "";
        }

        System.out.println(k + ":" +strarr.length);
        int sum = 0;
        int max = sum;
        int count = 0;
        int first = 0;
        int idx =0;
        for(int i=0; i<strarr.length; i++){
            sum += strarr[i].length();
            System.out.println(strarr[i]);
            if(i >= k) {
                sum = sum - strarr[i - k].length();
            }
            System.out.println(sum);

            if(max < sum ){
                max = sum;
                idx = i;
            }
        }
        List<String> list = Arrays.asList(strarr).subList(idx-(k-1), idx+1);

        return list.stream().map(str->str.toString()).collect(Collectors.joining());
    }

//    public static String longestConsec(String[] strarr, int k) {
//        // your code
//        if(strarr.length < k || k <= 0){
//            return "";
//        }
//        int max = 0;
//        int idx = 0;
//        for(int i=0; i<strarr.length; i++){
//            max += strarr.length;
//            if(strarr[i].length() > max){
//                max =  strarr[i].length();
//                idx = i;
//            }
//        }
//
//        List<String> oriList = Arrays.asList(strarr);
//        System.out.println(oriList.stream().max(Comparator.comparingInt(String::length)).get());
//
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//
//        if(idx+k <= strarr.length) {
//            list1 = Arrays.asList(strarr).subList(idx, idx + k);
//        }else{
//            int term = (idx+k) - strarr.length;
//            list1 = Arrays.asList(strarr).subList(idx-term, strarr.length);
//        }
//        if((idx+1)-k >= 0) {
//            list2 = Arrays.asList(strarr).subList((idx + 1) - k, idx + 1);
//        }else{
//            int term = (idx + 1) - k;
//            list2 = Arrays.asList(strarr).subList(0, (idx + 1)+Math.abs(term));
//        }
//
//        String temp1 = list1.stream().map(str->str.toString()).collect(Collectors.joining());
//        String temp2 = list2.stream().map(str->str.toString()).collect(Collectors.joining());
//        System.out.println(temp1);
//        System.out.println(temp2);
//
//        return temp1.length() > temp2.length() ? temp1 : temp2;
//    }
//
//    static class Item{
//        int idx;
//        String str;
//
//        public Item(int idx, String str){
//            this.idx = idx;
//            this.str = str;
//        }
//    }
}