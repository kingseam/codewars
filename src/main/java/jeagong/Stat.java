import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stat {

	public static String stat(String strg){
		// your code
		SimpleDateFormat formatter = new SimpleDateFormat("HH|mm|ss");

		long[] longArray = Stream.of(strg.split(", ")).mapToLong(i -> {
			try {
				return formatter.parse(i).getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return 0;
		}).toArray();
		Arrays.sort(longArray);
		
		int len = longArray.length;
		long standard = 0;
		try {
			standard = formatter.parse("00|00|00").getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String avg = formatter.format(LongStream.of(longArray).average().getAsDouble());
		
		String range = formatter.format(longArray[len - 1] < 0 ? longArray[len - 1] - longArray[0] + standard
				: longArray[len - 1] - longArray[0]);
		String median = formatter
				.format(len % 2 == 0 ? (longArray[len / 2] + longArray[len / 2 - 1]) / 2 : longArray[len / 2]);

		StringBuilder sb = new StringBuilder();
		sb.append("Range: ").append(range).append(" Average: ").append(avg).append(" Median: ").append(median);
		return sb.toString();
	}
}
