package codiliity;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null ) return 0;
        if(A.length > 100000) return 0;

        Arrays.sort(A);

        if(A[0] != 1) return 0;

        for(int i=1; i<A.length; i++) {
            if(A[i] != A[i-1] + 1) {
                return 0;
            }
        }
        return 1;
    }

    /*
    public void quickSort(int arr[], int left, int right){
        if(left < right) {
            int pivotIndex = partition(arr,left,right);
            quickSort(arr,left,pivotIndex-1);
            quickSort(arr,pivotIndex+1,right);
        }
    }

    public int partition(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        while(left < right){
            while((data[left]) < pivot) left++;
            while((data[right]) > pivot) right--;

            if(left < right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
        }

        return left;
    }

     */

    static public void main(String... args){
        PermCheck pc = new PermCheck();
        System.out.println(pc.solution(new int[]{4,1,3,2}));
        System.out.println(pc.solution(new int[]{4,1,3}));
    }
}
