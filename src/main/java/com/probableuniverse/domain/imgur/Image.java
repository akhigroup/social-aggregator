package com.probableuniverse.domain.imgur;

public class Image {
	String id;
	String title;
	String description;
	Integer datetime;
	String type;
	Boolean animated;
	Integer width;
	Integer height;
	Integer size;
	Integer views;
	Integer bandwidth;
	String vote;
	String favorite;
	String nsfw;
	String section;
	String account_url;
	String account_id;
	String comment_preview;
	String link;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDatetime() {
		return datetime;
	}
	public void setDatetime(Integer datetime) {
		this.datetime = datetime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getAnimated() {
		return animated;
	}
	public void setAnimated(Boolean animated) {
		this.animated = animated;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public Integer getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAccount_url() {
		return account_url;
	}
	public void setAccount_url(String account_url) {
		this.account_url = account_url;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getComment_preview() {
		return comment_preview;
	}
	public void setComment_preview(String comment_preview) {
		this.comment_preview = comment_preview;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getNsfw() {
		return nsfw;
	}
	public void setNsfw(String nsfw) {
		this.nsfw = nsfw;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	
}
