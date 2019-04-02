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
    
    public static ArrayList<twitterADT> filter(String lang,int Date, String region, int time)throws IOException, ParseException{
        ArrayList<twitterADT> tweet;
        tweet=LoadUsers("src/javaapplication2/test.json");
        return null;
    }

}
