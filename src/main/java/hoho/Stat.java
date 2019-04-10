package hoho;

import java.util.*;
import java.text.*;
public class Stat {
  static SimpleDateFormat sdf = new SimpleDateFormat("HH|mm|ss");            
    public static String stat(String strg) {
      String[] seperatedStrArr = seperateString(strg);
      
      List<Long> arrLong = stringToList(seperatedStrArr);
      Collections.sort(arrLong);
    
      String range = calcRange(arrLong);
      String average = calcAverage(arrLong);
      String median = calcMedian(arrLong);
    
      StringBuffer sb = new StringBuffer("Range: ").append(range).append(" Average: ").append(average).append(" Median: ").append(median);
      return String.valueOf(sb);
    }
  
  public static String calcRange(List<Long> arrLong){
    long range;
    int size = arrLong.size();
    
    range = arrLong.get(arrLong.size()-1) - arrLong.get(0);
    
    Date date = new Date(range);  //range
    return String.valueOf(sdf.format(date));
  }
  
  public static String calcAverage(List<Long> arrLong){
    long totalTime = 0;
    for(Long time : arrLong){
      totalTime += time;
    }
    Date date = new Date(totalTime/arrLong.size());  //average
    return String.valueOf(sdf.format(date));
  }
  
  public static String calcMedian(List<Long> arrLong){
    long median;
    int size = arrLong.size();    
    if(size%2==0){  //짝수
      int m = size/2;
      int n = size/2-1;
      median = (arrLong.get(m)+arrLong.get(n))/2;
    }else{  //홀수
      int m = size/2;
      median = arrLong.get(m);
    }
    Date date = new Date(median);  //median
    return String.valueOf(sdf.format(date));
  }
  
   public static String[] seperateString(String strg){
    return strg.split(", ");  //01:15:59
  }
  
  public static List<Long> stringToList(String[] seperatedStrArr){
    List<Long> arrLong = new ArrayList<Long>();    
    try{
      Date date;      
      for(String seperatedStr : seperatedStrArr){
        date = sdf.parse(seperatedStr);
        arrLong.add(date.getTime());
      }
    }catch(ParseException pe){
      pe.printStackTrace();
    }
    return arrLong;
  }
}
	
