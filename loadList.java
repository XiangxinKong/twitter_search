package ADT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class loadList {
	private static List<userADT> userList = new ArrayList<userADT>();
	private static List<twitterADT> twitterList = new ArrayList<twitterADT>();
	
	public static void LoadUsers() throws FileNotFoundException {
		String id;
		String gender;
		int age;
		String region;
		int time;
		String tweet; 
		userADT users;
		twitterADT twitters;
		String temp;
		
		Scanner s_user;
		Scanner s_twitter;
		s_user = new Scanner(new File("test_user.txt"));
		s_twitter = new Scanner(new File("test_tweets.txt"));
		
		for (int i = 0; s_user.hasNextLine(); i++) {
			temp = s_user.nextLine();
			id = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			age = Integer.valueOf(temp.substring(0, temp.indexOf('\t')));
			temp = temp.substring(temp.indexOf('\t')+1);
			gender = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			region = temp;
			users = new userADT(id, gender, age, region);
			userList.add(users);
		}
		
		for (int i = 0; s_twitter.hasNextLine(); i++) {
			temp = s_user.nextLine();
			id = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			tweet = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			time = Integer.valueOf(temp.substring(0, 4));
			
		}
		
		
	}
	
	public static void main(String args[]) throws FileNotFoundException {
		String id;
		String gender;
		int age;
		String region;
		long time;
		String tweet; 
		userADT users;
		twitterADT twitters;
		String temp;
		
		Scanner s_user;
		Scanner s_twitter;
		s_user = new Scanner(new File("test_user.txt"));
		s_twitter = new Scanner(new File("test_tweets.txt"));
		
		for (int i = 0; s_user.hasNextLine(); i++) {
			temp = s_user.nextLine();
			id = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			age = Integer.valueOf(temp.substring(0, temp.indexOf('\t')));
			temp = temp.substring(temp.indexOf('\t')+1);
			gender = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			region = temp;
			users = new userADT(id, gender, age, region);
			userList.add(users);
		}
		
		for (int i = 0; s_twitter.hasNextLine(); i++) {
			temp = s_twitter.nextLine();
			id = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			tweet = temp.substring(0, temp.indexOf('\t'));
			temp = temp.substring(temp.indexOf('\t')+1);
			time = Long.valueOf(temp.substring(0, 4) + temp.substring(5, 7) + temp.substring(8, 10) + temp.substring(11, 13) + temp.substring(14, 16) + temp.substring(17));
			twitters = new twitterADT(tweet, time, id);
			twitterList.add(twitters);
			System.out.println(twitterList.get(i).getTime());
		}
		
	}
	
}
