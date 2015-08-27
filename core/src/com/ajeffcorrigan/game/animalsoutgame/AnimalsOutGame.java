package com.ajeffcorrigan.game.animalsoutgame;

import com.ajeffcorrigan.game.animalsoutgame.screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimalsOutGame extends Game {
	
	public static int gh;								//Game height.
	public static int gw;								//Game width.
	public SpriteBatch batch;							//SpriteBatch object.

	@Override
	public void create () {
		//Initialize public objects and variables.
		gw = Gdx.graphics.getWidth();					//Get graphics width.
		gh = Gdx.graphics.getHeight();					//Get graphics height.
		batch = new SpriteBatch();						//Initialize the SpriteBatch object.
		setScreen(new PlayScreen(this));		
	}
	
	@Override
	public void render () {
		super.render();
	}
	
}
