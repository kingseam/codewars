public class ReverseWords{

 public static String reverseWords(String str){
     //write your code here...
     String[] array = str.split(" ");
		 str="";
		  
		 for(int i=array.length-1;i>=0;i--){
			 if(i==0){
			  str+=array[i];  
			 }else{
			  str+=array[i]+" ";
			 }
		 } 
		return str;
  }
}
