package com.gamescrud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gamescrud.model.Game;
import com.gamescrud.service.GameService;

@RestController
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping({"/games", "/", ""})
	public List<Game> getAllGames(){
		List<Game> allgames=gameService.getAllGames();
		return allgames;
	}
	@GetMapping({"/gamebyid"})
	public Game getGamebyId(@RequestParam Long id) {
		Game game= gameService.getGamebyId(id);
		return game;
	}
	@PostMapping({"/games/id"})
	public String StoreGame() {
		return "Storing game in server";
	}
	
	@PutMapping({"/updategames/id"})
	public Game updateGamebyId(@RequestBody Game game, @RequestParam Long id) {
		Game updateGame= gameService.UpdateGamebyId(game, id);
		return updateGame;
	}
	@DeleteMapping({"/dltgamesbyid"})
	public String DeleteGamebyId(@RequestParam Long id) {
		gameService.deletegamebyId(id); 
		return "Game is Deleted";
	}
}
