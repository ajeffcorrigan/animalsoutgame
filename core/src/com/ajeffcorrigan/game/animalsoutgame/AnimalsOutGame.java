package com.ajeffcorrigan.game.animalsoutgame;

import com.ajeffcorrigan.game.animalsoutgame.states.IntroState;
import com.ajeffcorrigan.game.animalsoutgame.tools.GameStateManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AnimalsOutGame extends ApplicationAdapter {
	
	
	public static final boolean DEBUGON = true;			//Turn debugging on or off.
	private SpriteBatch batch;
	private GameStateManager gsm;
	
	public static int gh;								//Game height.
	public static int gw;								//Game width.
			
	public void create () {
		//Initialize public objects and variables.
		gw = Gdx.graphics.getWidth();					//Get graphics width.
		gh = Gdx.graphics.getHeight();					//Get graphics height.
		batch = new SpriteBatch();
		gsm.push(new IntroState(gsm));
		Gdx.gl.glClearColor(1, 0, 0, 1);
				
	}
	
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
}
