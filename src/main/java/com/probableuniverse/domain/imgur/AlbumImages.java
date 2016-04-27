package com.probableuniverse.domain.imgur;

import java.util.ArrayList;
import java.util.List;

import com.probableuniverse.domain.imgur.Image;

public class AlbumImages {
	List<Image> data = new ArrayList<Image>();

	public List<Image> getData() {
		return data;
	}

	public void setData(List<Image> data) {
		this.data = data;
	}
	
}
