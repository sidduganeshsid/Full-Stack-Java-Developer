package com.helloTecky.SpringFWGame;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.helloTecky.SpringFWGame.game.GamingConsole;
import com.helloTecky.SpringFWGame.game.SuperContraGame;
import com.helloTecky.SpringFWGame.game.gameRunner;

@SpringBootApplication
//@Configuration
@ComponentScan("com.helloTecky.SpringFWGame.game")
public class SpringFwGameApplication {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new MarioGame();
//		return game;
//	}
//	
//	@Bean
//	public gameRunner game(GamingConsole game) {
//		var gameRunner = new gameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
	var context = new AnnotationConfigApplicationContext(SpringFwGameApplication.class);
		
		context.getBean(GamingConsole.class).up();
		context.getBean(gameRunner.class).run();
	}

}
