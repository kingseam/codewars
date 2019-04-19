package codiliity;

public class TapeEquilibrium {
    public int solution(int[] A){
        if(A.length > 100000) return 0;
        int min = 1001;

        int sum = 0;
        int first = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] > 1000 || A[i] < -1000) return 0;
            sum += A[i];
        }

        for(int i=0; i<A.length-1; i++){
            sum -= A[i];
            first += A[i];
            if(min > (Math.abs(sum -first))){
                min = (Math.abs(sum - first));
            }
        }
        return min;
    }

    static public void main(String... args){
        TapeEquilibrium tp = new TapeEquilibrium();
        System.out.println("return " + tp.solution(new int[]{3,1,2,4,3}));
    }
}
