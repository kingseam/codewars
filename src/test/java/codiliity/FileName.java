package codiliity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileName {
	public void parse(String name){
		List<String> list = Arrays.asList(name.split("\n"));
		Map<String, List<String>> map = new HashMap<>();
		for(String str : list){

			if(str.split(",")[0].contains(".jpg") && map.containsKey(str.split(",")[1])) {
				map.get(str.split(",")[1]).add(str.split(",")[2]);
			}else if( !map.containsKey(str.split(",")[1]) ){
				List<String> temp = new ArrayList<>();
				temp.add(str.split(",")[2]);
				map.put(str.split(",")[1], temp);
			}
		}

		for(Entry<String, List<String>> entry : map.entrySet()){
			Collections.sort(entry.getValue());
		}

		return;
	}

	static public void main(String... args){
		FileName fn = new FileName();
		fn.parse("photo.jpg, Warsaw, 2013-09-05 14:08:15\n"
			+ "john.png, London, 2015-06-20 15:13:22\n"
			+ "myFriends.png, Warsaw, 2013-09-05 14:07:13\n"
			+ "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n"
			+ "pisatower.jpg, Paris, 2015-07-22 23:59:59\n"
			+ "BOB.jpg, London, 2015-08-05 00:02:03\n"
			+ "notredame.png, Paris, 2015-09-01 12:00:00\n"
			+ "me.jpg, Warsaw, 2013-09-06 15:40:22\n"
			+ "a.png, Warsaw, 2016-02-13 13:33:50\n"
			+ "b.jpg, Warsaw, 2016-01-02 15:12:22\n"
			+ "c.jpg, Warsaw, 2016-01-02 14:34:30\n"
			+ "d.jpg, Warsaw, 2016-01-02 15:15:01\n"
			+ "e.png, Warsaw, 2016-01-02 09:49:09\n"
			+ "f.png, Warsaw, 2016-01-02 10:55:32\n"
			+ "g.jpg, Warsaw, 2016-02-29 22:13:11");
	}
}
