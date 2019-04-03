package javaapplication2;

public class twitterADT {
		private String date;
		private String tag;
		private String language;
		private String time;
		private String region;
		private long likeNum;
		
		public twitterADT(String date, String tag, String language, String time, String region, long likeNum) {
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
		
		public long getLikeNum() {
			return this.likeNum;
		}
		
		public int compareTo(twitterADT j) {
			if (this.getLikeNum() == j.getLikeNum())
				return this.getTime().compareTo(j.getTime());
			
			return (this.getLikeNum() < j.getLikeNum()) ? -1 : 1;
		} 
}
