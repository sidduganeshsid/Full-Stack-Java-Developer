package com.helloTecky.SpringFWGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helloTecky.SpringFWGame.game.GamingConsole;
import com.helloTecky.SpringFWGame.game.MarioGame;
import com.helloTecky.SpringFWGame.game.gameRunner;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public gameRunner gamerun(GamingConsole game) {
		var gameRunner = new gameRunner(game);
		return gameRunner;
	}
}
