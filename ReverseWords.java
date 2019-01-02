public class ReverseWords {
	public static String reverseWords(String str){
		//write your code here...
		String arr[] = str.split(" ");
		String result = "";
		for(int i=arr.length-1; i>0; i--) {
			result += arr[i] + " ";
		}
		result += arr[0];
		System.out.println(result);
		return result;
	 }
}
