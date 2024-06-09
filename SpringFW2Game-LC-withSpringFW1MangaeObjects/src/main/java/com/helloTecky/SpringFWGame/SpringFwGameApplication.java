package com.helloTecky.SpringFWGame;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helloTecky.SpringFWGame.game.GamingConsole;
import com.helloTecky.SpringFWGame.game.gameRunner;

@SpringBootApplication
public class SpringFwGameApplication {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		context.getBean(gameRunner.class).run();
	}

}
