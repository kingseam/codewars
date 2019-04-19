package codiliity;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        if(A.length > 100000) return new int[0];
        if(N > 100000 || N < 1) return new int[0];
        int[] arr = new int[N];
        int max = 0;
        int currentMax = 0;

        for(int i=0; i<A.length; i++){
            if(N < A[i]){
                currentMax = max;
            }else {
                if(arr[A[i]-1] < currentMax ) {
                    arr[A[i] - 1] = currentMax + 1;
                }else{
                    arr[A[i] - 1]++;
                }

                if(max < arr[A[i]-1]){
                    max = arr[A[i]-1];
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < currentMax) arr[i] = currentMax;
        }

        return arr;
    }

    static public void main(String... args){
        MaxCounter mc = new MaxCounter();
        mc.solution(5, new int[]{3,2,2,4,2});
    }
}
