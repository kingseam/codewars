package huntak;

import comm.ReverseWordsImpl;

public class ReverseWords implements ReverseWordsImpl {
	public String reverseWords(String str){
		String[] splitStr = str.split(" ");
    	String answer = splitStr[0];
    	
    	for(int i = 1; i < splitStr.length; i++){
    		answer = splitStr[i] + " " + answer;
    	}
        
        return answer;
	 }
}
