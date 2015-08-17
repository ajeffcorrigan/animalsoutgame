package com.ajeffcorrigan.game.animalsoutgame;

import com.ajeffcorrigan.game.animalsoutgame.tools.GameScreenManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimalsOutGame extends ApplicationAdapter {
	
	public static final boolean DEBUGON = true;			//Turn debugging on or off.
	public OrthographicCamera camera;					
	public SpriteBatch batch;
	
	public static int gh;								//Game height.
	public static int gw;								//Game width.
	
	public GameScreenManager gsm;
		
	public void create () {
		//Initialize public objects and variables.
		gw = Gdx.graphics.getWidth();					//Get graphics width.
		gh = Gdx.graphics.getHeight();					//Get graphics height.
		batch = new SpriteBatch();
		
		//Initialize and setup the camera.
		camera = new OrthographicCamera();
		camera.setToOrtho(false,gw,gh);
				
	}
	
	public void render () {
		
	}
	
	static enum GameState {
		title, activegame, pausegame, endgame
	}
	
}
