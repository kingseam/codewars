import java.util.function.Function;
import java.util.StringTokenizer;

class Opstrings {
    
    public static String vertMirror (String strng) {
      String rslt = "";
      String[] splitArr = strng.split("\n");
      
      for (int i = 0; i < splitArr.length; i++) {
        rslt += reverseString(splitArr[i]);
        if (i != splitArr.length - 1)
				  rslt += "\n";
		  }
	  	return rslt;
    }
    
    public static String horMirror (String strng) {
      StringTokenizer s = new StringTokenizer(strng, "\n");
      String reverseStr = s.nextToken();
      
      while (s.hasMoreTokens())
        reverseStr = s.nextToken() + "\n" + reverseStr;
      return reverseStr;
    }
    
    public static String oper(Function<String, String> operator, String s) {
      return operator.apply(s);
    }
    
    public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}
}
