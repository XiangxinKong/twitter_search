package pkg2xb3;

import java.util.ArrayList;
import java.util.List;

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
	
	public twitterADT[] searchTweets(List<userADT> set, int n, String g, String r, long a, long b) {
		List<twitterADT> result = new ArrayList<twitterADT>();
		twitterADT[] resultinarray;
		for(int i = 0; i < set.size(); i++) {
			if(userEligible(set.get(i),n,g,r)) {
				
				//tList??? @_@
				for(int j = 0; j < set.get(i).gettlist().size(); j++) {
					if (during(set.get(i).gettlist().get(j),a,b))
						result.add(set.get(i).gettlist().get(j));
				} 
				
				
			}
		}
		resultinarray = new twitterADT[result.size()];
		sort sorter = new sort();
		sorter.sort(result.toArray(resultinarray), resultinarray.length);
		
		
		return resultinarray;
	}

}
