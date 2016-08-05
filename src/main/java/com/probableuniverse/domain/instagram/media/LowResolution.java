package com.probableuniverse.domain.instagram.media;

public class LowResolution {
	String url;
	String width;
	String hieght;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHieght() {
		return hieght;
	}
	public void setHieght(String hieght) {
		this.hieght = hieght;
	}
	@Override
	public String toString() {
		return "LowResolution [url=" + url + ", width=" + width + ", hieght="
				+ hieght + "]";
	}
}
