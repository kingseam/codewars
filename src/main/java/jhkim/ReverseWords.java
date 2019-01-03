package jhkim;

import comm.ReverseWordsImpl;
import java.util.StringTokenizer;

public class ReverseWords implements ReverseWordsImpl {
 public String reverseWords(String str){
     StringTokenizer s = new StringTokenizer(str, " ");
     String reverseStr = s.nextToken();
     while (s.hasMoreTokens())
       reverseStr = s.nextToken() + " " + reverseStr;
     return reverseStr;
 }
}
