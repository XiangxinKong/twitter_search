/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */
import com.sun.javafx.collections.MappingChange.Map;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import static javaapplication2.ReadData.LoadUsers;
import org.json.simple.parser.ParseException;

public class search {
    
    public static String search(String lang,int Begin_date, int End_date, String region, int Begin_time, int End_time)throws IOException, ParseException{
       HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> tweet=filter(lang,Begin_date,End_date,region,Begin_time,End_time);
        for(int i=0;i<tweet.size();i++){
            System.out.println(tweet.get(i));
            if(map.containsKey(tweet.get(i))){
                map.put(tweet.get(i), map.get(tweet.get(i))+1);
            }else{
                map.put(tweet.get(i),0);
            }
        }
        
        String top="";
        int num=0;
        for(HashMap.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
          
            if(entry.getValue()>num){
                num=entry.getValue();
                top=entry.getKey();
            }
        }
        System.out.println("\n\nrrrrrrrrrrr +"+top);
        return top;
    }
    
    public static ArrayList<String> filter(String lang,int Begin_date, int End_date, String region, int Begin_time, int End_time)throws IOException, ParseException{
        ArrayList<twitterADT> tweet;
        ArrayList<String> out_tweet = new ArrayList<String>();
        tweet=LoadUsers("src/javaapplication2/test.json");
        for (int i = 0; i < tweet.size(); i++) {
        	if (true || Begin_date <= Integer.valueOf(tweet.get(i).getDate()) && Integer.valueOf(tweet.get(i).getDate()) <= End_date && Integer.valueOf(tweet.get(i).getTime()) >= Begin_time && Integer.valueOf(tweet.get(i).getTime()) <= End_time && tweet.get(i).getLanguage().equals(lang) && tweet.get(i).getRegion().equals(region)) {
        		out_tweet.add(tweet.get(i).getTag());
        	}
        }
        return out_tweet;
    }

}
