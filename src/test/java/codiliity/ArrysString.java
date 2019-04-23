package codiliity;

import java.util.Arrays;

public class ArrysString {
	public int solution(int[] A) {
		// write your code in Java SE 8
		if(A.length > 100000) return 0;

		A = Arrays.stream(A).filter(i->i>0).distinct().sorted().toArray();
		if(A.length == 0) return 1;
		if(A[0] != 1) return 1;
		for(int i=0; i<A.length-1; i++){
			if(A[i]+1 != A[i+1]) return A[i]+1;
		}

		return A[A.length-1]+1;
	}
}
