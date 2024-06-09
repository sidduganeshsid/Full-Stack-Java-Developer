package com.helloTecky.SpringFWGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	//gameRunner class is tightly coupled with the MarioGame
	//need to do code changes.
	//coupling = how much change is involved in changing something.
	//eg: laptop vs computer
	//only thing constant in technology is change
	//business requirement , fw , code changes
	
//	MarioGame game;
	
	GamingConsole game;
	
	public gameRunner(@Qualifier("SuperContra") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
