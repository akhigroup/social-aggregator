package com.probableuniverse.service.impl;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;

import org.springframework.stereotype.Service;

import POGOProtos.Networking.Envelopes.RequestEnvelopeOuterClass;

import com.pokegoapi.api.PokemonGo;
import com.pokegoapi.api.inventory.Inventories;
import com.pokegoapi.api.map.pokemon.CatchablePokemon;
import com.pokegoapi.api.player.PlayerProfile;
import com.pokegoapi.auth.PtcCredentialProvider;
import com.pokegoapi.exceptions.LoginFailedException;
import com.pokegoapi.exceptions.NoSuchItemException;
import com.pokegoapi.exceptions.RemoteServerException;
import com.probableuniverse.service.PokemonGoService;

@Service
public class PokemonGoServiceImpl implements PokemonGoService{
	
	OkHttpClient http = new OkHttpClient();
	RequestEnvelopeOuterClass.RequestEnvelope.AuthInfo auth = null;
	
	public List<CatchablePokemon> getCatchablePokemon(Double latitude, Double longitude){
		try {
			//or google
			//new PokemonGo(GoogleCredentialProvider(http,listner));
			//Subsiquently 
			//new PokemonGo(GoogleCredentialProvider(http,refreshtoken));
			PokemonGo go = new PokemonGo(new PtcCredentialProvider(http, "",
					""), http);
			// set location
			go.setLocation(latitude, longitude, 0);
	
			PlayerProfile pp = go.getPlayerProfile();
			Inventories inv = go.getInventories();
			List<CatchablePokemon> catchablePokemon = go.getMap().getCatchablePokemon();
			
			System.out.println("Pokemon in area:" + catchablePokemon.size());
			List<String> nearbyPokemon = new ArrayList<String>();
			for (CatchablePokemon cp : catchablePokemon) {
				nearbyPokemon.add(cp.getPokemonId().name());
	
			}
	
//			for (CatchablePokemon cp : catchablePokemon) {
//				// You need to Encounter first.
//				EncounterResult encResult = cp.encounterPokemon();
//				// if encounter was succesful, catch
//				if (encResult.wasSuccessful()) {
//					System.out.println("Encounted:" + cp.getPokemonId());
//					CatchResult result = cp.catchPokemonWithRazzBerry();
//					System.out.println("Attempt to catch:" + cp.getPokemonId() + " " + result.getStatus());
//				}
//	
//			}
			return catchablePokemon;
	
		} catch (LoginFailedException | RemoteServerException e) {//| NoSuchItemException
			// failed to login, invalid credentials, auth issue or server issue.
			System.out.println("Add a logger");
			//Log.e("Main", "Failed to login or server issue: ", e);
			return null;
		}
	}
}
