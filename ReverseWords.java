public class ReverseWords {
	public static String reverseWords(String str){
		//write your code here...
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = split.length-1; i >= 0; i--) {
			sb.append(i == 0 ? split[i] : split[i]+" ");
		}
		System.out.println(sb);
		return sb.toString();
	 }
}
