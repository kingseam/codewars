import java.util.function.Function;
class Opstrings {
    
    public static String vertMirror (String strng) {
        // your code
        String[] splitedStrArr = strng.split("\n");
        String resultStr = "";
        
        char[] charArr;
        String temp;
        for(String splitedStr : splitedStrArr){
          temp ="";
          charArr = splitedStr.toCharArray();
          for(int i=charArr.length-1; i>=0; i--){   //문자열 reverse
            temp += Character.toString(charArr[i]);
          }          
          resultStr = resultStr + temp + "\n";
        }
        
        resultStr = resultStr.substring(0, resultStr.length()-1);   //마지막 '\n'제거
        return resultStr;
    }
    public static String horMirror (String strng) {
        // your code
        String[] splitedStrArr = strng.split("\n");
        String resultStr = "";
        
        for(int i=splitedStrArr.length-1, j=0; i>=0; i--, j++){
          resultStr = resultStr + splitedStrArr[i] + "\n"; 
        }
        resultStr = resultStr.substring(0, resultStr.length()-1);   //마지막 '\n'제거
        return resultStr;
    }
    public static String oper(Function<String, String> operator, String s) {
      return operator.apply(s);
    }
}
