package pkg2xb3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData {
	public static ArrayList<twitterADT> userList;
	
	
	public static ArrayList<twitterADT> LoadUsers(String path) throws IOException, ParseException {
		userList = new ArrayList<twitterADT>();
		String date = null;
		String tag = null;
		String language = null;
		String time = null;
		String region = null;
		long likenumber = 0;
		
		Map map = new HashMap();
		map.put("JAN", "01");
		map.put("FEB", "02");
		map.put("MAR", "03");
		map.put("APR", "04");
		map.put("MAY", "05");
		map.put("JUN", "06");
		map.put("JUL", "07");
		map.put("AUG", "08");
		map.put("SEP", "09");
		map.put("OCT", "10");
		map.put("NOV", "11");
		map.put("DEC", "12");
		
		File ff = new File(path);
		BufferedReader reader = null;
		JSONObject objects;
		try {
			reader = new BufferedReader(new FileReader(ff));
			String temp = null;
			
			while((temp = reader.readLine()) != null) {
				objects = (JSONObject) new JSONParser().parse(temp);
				
				JSONObject qwe = (JSONObject) objects.get("user");
				language = (String)qwe.get("lang");
				
				tag = (String)objects.get("text");
				
				String da = (String)objects.get("created_at");
				String []da1 = da.split(" ");
				date = da1[5] + map.get(da1[1].toUpperCase()) + da1[2];
				
				time = da1[3].substring(0, 2) + da1[3].substring(3, 5) + da1[3].substring(6);
				
				likenumber = (Long)qwe.get("favourites_count");
				
				if((String)qwe.get("time_zone")==null)	region ="Unknown";
				else									region = (String)qwe.get("time_zone");
				
				/* 
				 * add to adt
				 */
				twitterADT element = new twitterADT(date, tag, language, time, region, likenumber);
				userList.add(element);
			}
			
		}
		catch (FileNotFoundException e) { e.printStackTrace(); }
		return userList;
	}
	
	



	
	/*
	 * Delete main after that;
	 */
	
	

	public static void main(String args[]) throws IOException, ParseException{
		String date;//
		String tag;//
		String language;//
		String time;//
		String region;
		int likenumber;
		Map map = new HashMap();
		map.put("JAN", "01");
		map.put("FEB", "02");
		map.put("MAR", "03");
		map.put("APR", "04");
		map.put("MAY", "05");
		map.put("JUN", "06");
		map.put("JUL", "07");
		map.put("AUG", "08");
		map.put("SEP", "09");
		map.put("OCT", "10");
		map.put("NOV", "11");
		map.put("DEC", "12");
		
		File ff = new File("src/pkg2xb3/test.json");
		BufferedReader reader = null;
		JSONObject objects;
		try {
			reader = new BufferedReader(new FileReader(ff));
			String temp = null;
			int i=0, j=0;
			/*
			while((temp = reader.readLine()) != null) {
				objects = (JSONObject) new JSONParser().parse(temp);
				if((String)objects.get("created_at")==null) i+=1;
				else j+=1;
				System.out.println(objects.get("created_at"));
			}
			*/
			
			while((temp = reader.readLine()) != null) {
				objects = (JSONObject) new JSONParser().parse(temp);
				JSONObject qwe = (JSONObject) objects.get("user");
				if((String)qwe.get("time_zone")==null) {i+=1;System.out.println("Unknown");}
				else j+=1;
				System.out.println(qwe.get("time_zone"));
			}
			System.out.println(i + " --- " + j);
			reader.close();
		} 
		catch (FileNotFoundException e) { e.printStackTrace(); }
	}
}
