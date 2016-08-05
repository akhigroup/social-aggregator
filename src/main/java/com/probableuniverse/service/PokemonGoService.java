package com.probableuniverse.service;

import java.util.List;

import com.pokegoapi.api.map.pokemon.CatchablePokemon;

public interface PokemonGoService {
	public List<CatchablePokemon> getCatchablePokemon(Double latitude, Double longitude);
}
