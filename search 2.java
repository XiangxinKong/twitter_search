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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import static javaapplication2.ReadData.LoadUsers;
import org.json.simple.parser.ParseException;

public class search {
    
    public static String search()throws IOException, ParseException{
       TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        ArrayList<twitterADT> tweet=filter("",1,"",1);
        for(int i=0;i<tweet.size();i++){
            if(map.containsKey(i)){
                map.put(tweet.get(i).getTag(), map.get(i)+1);
            }else{
                map.put(tweet.get(i).getTag(),0);
            }
        }
        
        return "";
    }
    
    public static ArrayList<twitterADT> filter(String lang,int Begin_date, int End_date, String region, int Begin_time, int End_time)throws IOException, ParseException{
        ArrayList<twitterADT> tweet;
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        tweet=LoadUsers("src/javaapplication2/test.json");
        for (int i = 0; i < tweet.size(); i++) {
        	if (Begin_date <= Integer.valueOf(tweet.get(i).getDate()) && Integer.valueOf(tweet.get(i).getDate()) <= End_date && Integer.valueOf(tweet.get(i).getTime()) >= Begin_time && Integer.valueOf(tweet.get(i).getTime()) <= End_time && tweet.get(i).getLanguage().equals(lang) && tweet.get(i).getRegion().equals(region)) {
        		out_tweet.add(tweet.get(i));
        	}
        }
        return out_tweet;
    }

}
