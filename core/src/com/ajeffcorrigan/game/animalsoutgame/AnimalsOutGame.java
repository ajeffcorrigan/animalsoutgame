package com.ajeffcorrigan.game.animalsoutgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimalsOutGame extends Game {
	
	private boolean assetsInit = false;					//Checks if assets have loaded. 
	public static final boolean DEBUGON = true;			//Turn debugging on or off.
	public OrthographicCamera camera;					
	public SpriteBatch batch;
	
	public static int gh;								//Game height.
	public static int gw;								//Game width.
	
	@Override
	public void create () {
		//Initialize public objects and variables.
		gw = Gdx.graphics.getWidth();					//Get graphics width.
		gh = Gdx.graphics.getHeight();					//Get graphics height.
		batch = new SpriteBatch();
		
		//Initialize and setup the camera.
		camera = new OrthographicCamera();
		camera.setToOrtho(false,gw,gh);
		
	}
}
