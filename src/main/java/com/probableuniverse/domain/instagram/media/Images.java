package com.probableuniverse.domain.instagram.media;

public class Images {
	LowResolution lowResolution;
	StandardResolution standardResolution;
	Thumbnail thumbnail;
	public LowResolution getLowResolution() {
		return lowResolution;
	}
	public void setLowResolution(LowResolution lowResolution) {
		this.lowResolution = lowResolution;
	}
	public StandardResolution getStandardResolution() {
		return standardResolution;
	}
	public void setStandardResolution(StandardResolution standardResolution) {
		this.standardResolution = standardResolution;
	}
	public Thumbnail getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	@Override
	public String toString() {
		return "Images [lowResolution=" + lowResolution
				+ ", standardResolution=" + standardResolution + ", thumbnail="
				+ thumbnail + "]";
	}
}
