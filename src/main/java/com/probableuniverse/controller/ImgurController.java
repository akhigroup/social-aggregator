package com.probableuniverse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.probableuniverse.domain.imgur.AlbumImage;
import com.probableuniverse.domain.imgur.AlbumImages;
import com.probableuniverse.service.ImgurService;

@RestController
public class ImgurController {
	
	@Autowired
	ImgurService imgurService;
	
	@RequestMapping("/get-imgur-album-images")
	public AlbumImages userImages(){
		return imgurService.getImgurAlbumImages();
	}
	
	@RequestMapping("/get-imgur-album-image/{image-id}")
	public AlbumImage albumImage(
			@PathVariable("image-id") String imageId){
		return imgurService.getImgurAlbumImage(imageId);
	}
	
}
