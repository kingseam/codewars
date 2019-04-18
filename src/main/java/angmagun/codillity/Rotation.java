package angmagun.codillity;

public class Rotation {
    public int[] solution(int[] A, int K) {
        if(A.length == 0) return new int[0];
        if(K <= 0 || K == A.length) return A;
        int size = A.length;
        int idx = K <= size ? size-K : size-(K % size);
        int[] result = new int[size];
        for(int i=0; i<size; i++){
            if(size == idx) idx = 0;
            result[i] = A[idx++];
        }
        return result;
    }
}
