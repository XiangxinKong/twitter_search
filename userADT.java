package pkg2xb3;

import java.util.ArrayList;
import java.util.List;

public class userADT {
	
	private String id;
	private String gender;
	private int age;
	private String region;
	private List<twitterADT> tlist = new ArrayList<twitterADT>();
	
	public userADT(String id, String gender, int age, String region) {
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.region = region;
	}
	
	public String getName(){
		return this.id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	
	public String getRegion() {
		return this.region;
	}
	
	public List<twitterADT> gettlist(){
		return this.tlist;
	}
	
	public void puttlist(twitterADT key) {
		this.tlist.add(key);
	}
}
