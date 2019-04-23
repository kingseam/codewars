package codiliity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;

public class Filaa {

	public String parse(String name) {
		List<Photo> photoList = new ArrayList<>(name.split("\n").length);
		Map<String, List<String>> map = new HashMap<>();
		String result = "";

		for (String str : name.split("\n")) {
			String extension = str.split(",")[0];
			String city = str.split(",")[1].replaceAll(" ", "");
			String date = str.split(",")[2].replaceAll("-", "").replaceAll(":", "").replaceAll(" ", "");
			photoList.add(new Photo(extension,city,date));
			if(map.containsKey(city)){
				map.get(city).add(date);
			}else{
				map.put(city, new ArrayList<>());
				map.get(city).add(date);
			}
		}

		for (Entry<String, List<String>> entry : map.entrySet()){
			Collections.sort(entry.getValue());
		}

		for(Photo photo : photoList){
			for(int i=0; i<map.get(photo.getCity()).size(); i++){
				if(photo.getDate().equals(map.get(photo.getCity()).get(i))){
					String pad = "";
					if(map.get(photo.getCity()).size() > 9){
						pad = "0";
					}
					if(i > 8){
						pad = "";
					}
					result += photo.getCity()+pad+(i+1)+"."+photo.extension+"\n";
				}
			}
		}
		return result;
	}

	static public void main(String... args) {
		Filaa fn = new Filaa();
		System.out.println(fn.parse("photo.jpg, Warsaw, 2013-09-05 14:08:15\n"
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
			+ "g.jpg, Warsaw, 2016-02-29 22:13:11"));
	}
}


class Photo {
	String extension;
	String city;
	String date;

	public Photo(String extension, String city, String date) {
		this.extension = extension.split("\\.")[1];
		this.city = city;
		this.date = date;
	}

	@Override
	public String toString() {
		return "extension=" + extension + " city=" + city + " date=" + date;
	}

	public String getExtension() {
		return extension;
	}

	public String getCity() {
		return city;
	}

	public String getDate() {
		return date;
	}
}