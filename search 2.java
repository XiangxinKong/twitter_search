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
    
    public static ArrayList<twitterADT> filter(String lang, int Date, String region, int Begin_time, int End_time, long likeNum)throws IOException, ParseException{
        ArrayList<twitterADT> tweet;
        ArrayList<twitterADT> tweet_outDate = new ArrayList<twitterADT>();
        ArrayList<twitterADT> tweet_outtime = new ArrayList<twitterADT>();
        ArrayList<twitterADT> tweet_outregion = new ArrayList<twitterADT>();
        ArrayList<twitterADT> tweet_outlang = new ArrayList<twitterADT>();
        ArrayList<twitterADT> tweet_outlikeNum = new ArrayList<twitterADT>();
        tweet=LoadUsers("src/javaapplication2/test.json");
        for (int i = 0; i < tweet.size(); i++) {
            if (Integer.valueOf(tweet.get(i).getDate()) == Date)
                tweet_outDate.add(tweet.get(i));
        }
        
        for (int i = 0; i < tweet_outDate.size(); i++) {
            if (Integer.valueOf(tweet.get(i).getTime()) >= Begin_time && Integer.valueOf(tweet.get(i).getTime()) <= End_time)
                tweet_outtime.add(tweet_outDate.get(i));
        }
        
        for (int i = 0; i < tweet_outtime.size(); i++) {
            if (lang.equalsTo("All Language"))
                tweet_outlang.add(tweet_outtime.get(i));
            else if (tweet.get(i).getLanguage().equals(lang)
                tweet_outlang.add(tweet_outtime.get(i));
        }
            
        for (int i = 0; i < tweet_outlang.size(); i++) {
            if (region.equalsTo("All Region"))
                tweet_outregion.add(tweet_outlang.get(i));
            else if (tweet.get(i).getLanguage().equals(lang)
                tweet_outDate.add(tweet.get(i));
        }
        	if (  tweet.get(i).getRegion().equals(region)) {
        		out_tweet.add(tweet.get(i));
        	}
        }
        return out_tweet;
    }

}
