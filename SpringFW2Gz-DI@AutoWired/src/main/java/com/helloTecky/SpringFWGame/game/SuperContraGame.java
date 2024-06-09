package com.helloTecky.SpringFWGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("sit");
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("shoot");
	}
}
