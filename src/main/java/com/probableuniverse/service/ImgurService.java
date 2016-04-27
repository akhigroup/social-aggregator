package com.probableuniverse.service;


import com.probableuniverse.domain.imgur.AlbumImage;
import com.probableuniverse.domain.imgur.AlbumImages;

public interface ImgurService {

	public AlbumImages getImgurAlbumImages();
	public AlbumImage getImgurAlbumImage(String imageId);
}
