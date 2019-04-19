package codiliity;

public class GapBinary {
    public int solution(int N) {
        // write your code in Java SE 8
        String result = Integer.toBinaryString(N);
        int count = 0;
        int max = 0;
        for (char ch : result.toCharArray()) {
            if (ch == '1') {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
            if (ch == '0') {
                count++;
            }
        }
        return max;
    }
}
