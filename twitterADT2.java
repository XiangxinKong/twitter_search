package fff;

public class twitterADT2 {
		private String date;
		private String tag;
		private String language;
		private String time;
		private String region;
		private int likeNum;
		
		public twitterADT2(String date, String tag, String language, String time, String region, int likeNum) {
			this.date = date;
			this.tag = tag;
			this.language = language;
			this.time = time;
			this.region = region;
			this.likeNum = likeNum;
		}
		
		public String getDate() {
			return this.date;
		}
		
		public String getTag() {
			return this.tag;
		}
		
		public String getLanguage() {
			return this.language;
		}
		
		public String getTime() {
			return this.time;
		}
		
		public String getRegion() {
			return this.region;
		}
		
		public int getLikeNum() {
			return this.likeNum;
		}
		
		public int compareTo(twitterADT2 j) {
			if (this.getLikeNum() == j.getLikeNum())
				return this.getTime().compareTo(j.getTime());
			
			return (this.getLikeNum() < j.getLikeNum()) ? -1 : 1;
		} 
}
