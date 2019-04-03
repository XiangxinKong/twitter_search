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

public class search_method {
    
    public static String search(ArrayList<String> in_tweet_tag)throws IOException, ParseException{
       HashMap<String, Integer> map = new HashMap<String, Integer>();
       
       
       
        
        for(int i=0;i<in_tweet_tag.size();i++){
            System.out.println(in_tweet_tag.get(i));
            if(map.containsKey(in_tweet_tag.get(i))){
                map.put(in_tweet_tag.get(i), map.get(in_tweet_tag.get(i))+1);
            }else{
                map.put(in_tweet_tag.get(i),0);
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
        //System.out.println("\n\nrrrrrrrrrrr +"+top);
        return top;
    }
    
    public static ArrayList<twitterADT> filter_date( ArrayList<twitterADT> in_tweet, int date)throws IOException, ParseException{
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        
        for (int i = 0; i < in_tweet.size(); i++) {
        	if (Integer.valueOf(in_tweet.get(i).getDate()) == date) {
        		out_tweet.add(in_tweet.get(i));
        	}
        }
        return out_tweet;
    }
    
    public static ArrayList<twitterADT> filter_time( ArrayList<twitterADT> in_tweet, int Begin_time, int End_time)throws IOException, ParseException{
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        
        for (int i = 0; i < in_tweet.size(); i++) {
        	if (Integer.valueOf(in_tweet.get(i).getTime().substring(0, 2)) >= Begin_time && Integer.valueOf(in_tweet.get(i).getTime().substring(0, 2)) <= End_time) {
        		out_tweet.add(in_tweet.get(i));
        	}
        }
        return out_tweet;
    }
    
    public static ArrayList<twitterADT> filter_region( ArrayList<twitterADT> in_tweet, String region)throws IOException, ParseException{
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        
        for (int i = 0; i < in_tweet.size(); i++) {
        	if (in_tweet.get(i).getRegion().equals(region)) {
        		out_tweet.add(in_tweet.get(i));
        	}
        }
        return out_tweet;
    }
    
    public static ArrayList<twitterADT> filter_lang( ArrayList<twitterADT> in_tweet, String lang)throws IOException, ParseException{
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        
        for (int i = 0; i < in_tweet.size(); i++) {
        	if (in_tweet.get(i).getLanguage().equals(lang)) {
        		out_tweet.add(in_tweet.get(i));
        	}
        }
        return out_tweet;
    }
    
    public static ArrayList<twitterADT> filter_pop( ArrayList<twitterADT> in_tweet, long likeNum)throws IOException, ParseException{
        ArrayList<twitterADT> out_tweet = new ArrayList<twitterADT>();
        
        for (int i = 0; i < in_tweet.size(); i++) {
        	if (in_tweet.get(i).getLikeNum() >= 10) {
        		out_tweet.add(in_tweet.get(i));
        	}
        }
        return out_tweet;
    }

    public static ArrayList<String> getTagList( ArrayList<twitterADT> in_tweet){
    	ArrayList<String> tagString = new ArrayList<String>();
    	for (int i = 0; i < in_tweet.size(); i++) {
    		tagString.add(in_tweet.get(i).getTag());
    	}
    	return tagString;
    }
    
    

}
