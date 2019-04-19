package angmagun.codillity;

public class OddoArray {
    public int solution(int[] A) {
        int result = 0;
        for(int num : A){
            result = result ^ num;;
        }
        return result;
    }

    public int solution_me(int[] A) {
        for(int i=0; i<A.length; i++){
            boolean isOk = false;
            for(int j=0; j<A.length; j++){
                if(i == j) continue;
                if(A[i] == A[j]) {
                    isOk =true;
                    break;
                }
            }
            if(!isOk) return A[i];
        }
        return 0;
    }
}
