package com.ajeffcorrigan.game.animalsoutgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ajeffcorrigan.game.animalsoutgame.AnimalsOutGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 800;
		config.width = 480;
		config.title = "Get the Animals Out!";
		config.resizable = false;
		new LwjglApplication(new AnimalsOutGame(), config);
	}
}
