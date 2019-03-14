package pkg2xb3;

public class search {

	private boolean underAge(userADT x, int n) {
		if (x.getAge() < n)
			return true;
		else
			return false;
	}

	private boolean isGender(userADT x, String g) {
		if (g.equals("default"))
			return true;
		if (x.getGender().equals(g))
			return true;
		else
			return false;
	}

	private boolean inRegion(userADT x, String r) {
		if (r.equals("default"))
			return true;
		if (x.getRegion().equals(r))
			return true;
		else
			return false;
	}

	private boolean during(twitterADT x, long a, long b) {
		if (x.getTime() > a && x.getTime() < b)
			return true;
		else
			return false;
	}

	private boolean userEligible(userADT x, int n, String g, String r) {
		return underAge(x,n) && isGender(x,g) && inRegion(x,r);
	} 
	
	public twitterADT[] searchTweets(userADT[] set, int n, String g, String r, long a, long b) {
		twitterADT[] result = {};
		for(int i = 0; i < set.length; i ++) {
			if(userEligible(set[i],n,g,r)) {
		/**		for(int j = 0; j < user.) {
					if (during(,a,b))
						result += ;
				} **/
			}
		}
		
		sort sorter = new sort();
		
		
		return result;
	}

}
