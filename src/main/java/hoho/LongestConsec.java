class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
      String rtnStr = "";

      int maxStartIndex = 0;
      int strarrLength = strarr.length;

      if(strarrLength == 0
         || strarrLength < k
         || k <= 0){
         return "";
      }
      int maxLength    = 0
         ,currentLength= 0;

      for(int i=0; i<strarrLength-k+1; i++){
        currentLength= 0;
        for(int j=i; j<i+k; j++){
          currentLength += strarr[j].length();
        }
        if(currentLength > maxLength){
          maxLength = currentLength;
          maxStartIndex = i;
        }
      }

      for(int i=maxStartIndex; i<maxStartIndex+k ; i++){
        rtnStr = String.join("", rtnStr, strarr[i]);
      }
      return rtnStr;
    }
}
