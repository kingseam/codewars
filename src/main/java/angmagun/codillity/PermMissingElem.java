package angmagun.codillity;

import java.util.stream.IntStream;

public class PermMissingElem {
    public int solution(int[] A) {
        int sum = A.length+1;
        for(int i=1; i<=A.length; i++){
            sum += i;
            sum -= A[i-1];
        }
        return sum;
    }
}
