package hkd;

import comm.ReverseWordsImpl;

public class ReverseWords implements ReverseWordsImpl {
	public String reverseWords(String str){
		//write your code here...
		String arr[] = str.split(" ");
		String result = "";
		for(int i=arr.length-1; i>0; i--) {
			result += arr[i] + " ";
		}
		result += arr[0];
		return result;
	 }
}
