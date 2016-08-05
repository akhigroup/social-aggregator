package com.probableuniverse.domain.instagram.users;

import com.probableuniverse.domain.instagram.media.Images;

/*
 * TODO: Use this class to create the user media, include the dependent sub classes as inner classes, 
 * independent sub classes should be separated into their own particular package
 */
public class UserMedia {
	/*
	 * Current placeholders for: 
	 *   -attribution
	 *   -tags
	 *   -location
	 *   -usersInPhoto
	 *   
	 */
	
	public String attribution;
	public String tags;
	public String type;
	public String location;
	public Comments comments;
	public String filter;
	public String createdTime;
	public String link;
	public Likes likes;
	public Images images;
	public String usersInPhoto;
	public String caption;
	public boolean userHasLiked;
	public String id;
	public User user;
	
	class Comments{
		public int count;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "Comments [count=" + count + "]";
		}
	}
	
	class Likes{
		public int count;

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public String toString() {
			return "Likes [count=" + count + "]";
		}
		
	}
}
