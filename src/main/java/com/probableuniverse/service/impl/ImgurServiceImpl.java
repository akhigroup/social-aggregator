package com.probableuniverse.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.probableuniverse.domain.imgur.AlbumImage;
import com.probableuniverse.domain.imgur.AlbumImages;
import com.probableuniverse.service.ImgurService;

@Service
public class ImgurServiceImpl implements ImgurService{
	@Autowired
	@Value("${imgur.client.auth}")
	private String imgurClientAuth;
	
	@Autowired
	@Value("${imgur.album.id}")
	private String imgurAlbumId;
	
	@Autowired
	@Value("${imgur.album.images.uri}")
	private String imgurAlbumImagesUri;

	@Autowired
	@Value("${imgur.album.image.uri}")
	private String imgurAlbumImageUri;
	

	public AlbumImages getImgurAlbumImages(){
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("album-id", imgurAlbumId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", imgurClientAuth);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<AlbumImages> response = restTemplate.exchange(imgurAlbumImagesUri, HttpMethod.GET, request, AlbumImages.class, vars);
		
		return response.getBody();
	}
	
	public AlbumImage getImgurAlbumImage(String imageId){
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("album-id", imgurAlbumId);
		vars.put("image-id", imageId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", imgurClientAuth);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<AlbumImage> response = restTemplate.exchange(imgurAlbumImageUri, HttpMethod.GET, request, AlbumImage.class, vars);
		
		return response.getBody();		
	}

}
