package codiliity;

public class Solution1 {

	public int solution(String S) {
		int count = 0;
		try {
			int num = Integer.parseInt(S, 2);
			if(num < 1 && num > 1000000) return count;

			while(num != 0) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num - 1;
				}
				count++;
			}
		}catch(NumberFormatException ne){
			return count;
		}

		System.out.println(count);

		return count;
	}
}
