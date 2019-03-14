package ADT;

import java.util.ArrayList;
import java.util.List;

public class twitterADT implements Comparable<twitterADT>{
	private String tweets;
	private long time;
	private String id;
	
	public twitterADT(String tweets, long time, String id) {
		this.id = id;
		this.tweets = tweets;
		this.time = time;
	}
	
	public String getId() {
		return this.id;
	}
	
	public long getTime() {
		return  this.time;
	}
	
	public String getTweets() {
		return this.tweets;
	}
	
	public List<twitterADT> getTwitter(String id, List<twitterADT> tList) {
		if (this.id == id)
			tList.add(this);
		return tList;
	}
	public int compareTo(twitterADT j) {
		if (this.getTime() == j.getTime())
			return this.getId().compareTo(j.getId());
		
		return (this.getTime() < j.getTime()) ? -1 : 1;
	}
	
	
}
