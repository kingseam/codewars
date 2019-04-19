package codiliity;

import java.util.Arrays;

public class FlogJump {
    public int solution(int X, int[] A) {
       if(A.length > 100000) return 0;
       if(X > A.length) return -1;
       boolean[] arr = new boolean[A.length+1];
       int cnt = 0;
       for(int i=0; i< A.length; i++){
           if(A[i] <= X){
               if(!arr[A[i]]){
                   arr[A[i]] = true;
                   cnt++;
               }
           }
           if(X == cnt) return i;
       }

       return -1;
    }

    static public void main(String... args){
        FlogJump fj = new FlogJump();
        fj.solution(5, new int[]{1,3,1,4,2,3,5,4});
    }
}
