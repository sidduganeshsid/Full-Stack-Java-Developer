package com.helloTecky.SpringFWGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.helloTecky.SpringFWGame.game.SuperContraGame;
import com.helloTecky.SpringFWGame.game.gameRunner;

@SpringBootApplication
public class SpringFwGameApplication {

	public static void main(String[] args) {
//		var marioGame = new MarioGame();
		var SuperContraGame = new SuperContraGame();
		var gameRunner = new gameRunner(SuperContraGame);
		gameRunner.run();
	}

}
