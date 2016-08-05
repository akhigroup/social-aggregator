package com.probableuniverse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.probableuniverse.service.PokemonGoService;

@RestController
public class PokemonGoController {

	@Autowired
	PokemonGoService pokemonGoService;
	
	@RequestMapping("/catchable-pokemon-latlng")
	public boolean catchablePokemonLatlng(
			@RequestParam(value="latitude", required=true) Double latitude,
			@RequestParam(value="longitude", required=true) Double longitude){
		
		pokemonGoService.getCatchablePokemon(latitude, longitude);
		
		return true;
	}
	
}
