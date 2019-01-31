import java.util.Arrays;

public class Stat {
        
	public static String stat(String strg) {
		String rsltStr = "";
		String[] runner = strg.split(", ");
		int[] secondsTime = convertStringToInt(runner);
		int len = runner.length;
		int range, avg, med, totalTime = 0;
		
		Arrays.sort(secondsTime);

		range = secondsTime[len - 1] - secondsTime[0];
    
		for (int i = 0; i < len; i++)
			totalTime += secondsTime[i];
		avg = totalTime / len;
    
		if (len % 2 == 1)
			med = secondsTime[len / 2];
		else
			med = (secondsTime[len / 2] + secondsTime[len / 2 - 1]) / 2;
		
		rsltStr += "Range: " + convertIntToString(range);
		rsltStr += " Average: " + convertIntToString(avg);
		rsltStr += " Median: " + convertIntToString(med);
		
		return rsltStr;
	}
	
	public static int[] convertStringToInt(String[] str) {
		int[] secondsTime = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			String[] time = str[i].split("\\|");
			for (int j = 0; j < 3; j++)
				secondsTime[i] += Integer.parseInt(time[j]) * Math.pow(60, 2 - j);
		}
		return secondsTime;
	}
	
	public static String convertIntToString(int time) {
		String str = "";
		str += String.format("%02d", time / 3600);
		str += "|";
		str += String.format("%02d", time % 3600 / 60);
		str += "|";
		str += String.format("%02d", time % 3600 % 60);
		return str;
	}
}
