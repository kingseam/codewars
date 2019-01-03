package suhyeon;

import comm.ReverseWordsImpl;

public class ReverseWords implements ReverseWordsImpl {
 public String reverseWords(String str){
     //write your code here...
     String[] line = str.split(" ");
     String reverseLine = "";
     for (int i = line.length - 1; i >= 0; i--) {
       if (i == 0) {
         reverseLine += line[0];
       } else {
         reverseLine += (line[i] + " ");
       }
     }
     
     return reverseLine;
 }
}