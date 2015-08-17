package com.ajeffcorrigan.game.animalsoutgame.screens;

import com.ajeffcorrigan.game.animalsoutgame.AnimalsOutGame;
import com.ajeffcorrigan.game.animalsoutgame.tools.jAssets;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class IntroScreen implements Screen {
	
	private boolean assetsInit = false;					//Checks if assets have loaded. 
	private AnimalsOutGame game;						
	private float timed = 0.0f;							//Timer variable to show splash screen.

	public IntroScreen(AnimalsOutGame aog) {
		game = aog;
		jAssets.loadTextureAs("logo", "badlogic.jpg");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
	    if(timed > 10 && assetsInit) {
	    } else {
	    	drawScreen();
		    timed += 3.2f * delta;
		    if(!assetsInit) {
		    	jAssets.loadTextureAs("spritesheet", "roguelikeSheet_transparent.png");
		    	jAssets.loadTextureAs("round", "round.png");
		    	jAssets.loadTextureAs("roundoutline", "round_outline.png");
		    	jAssets.createTextureRegion("pass", "spritesheet", 16, 64, 16, 16);
		    	jAssets.createTextureRegion("monkeyround", "round", 0, 282, 310, 260);
		    	assetsInit = true;
		    }
	    }    
		
	}

	private void drawScreen() {
		Gdx.gl.glClearColor(255, 255, 255, 0);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(jAssets.getTexture("logo"), 0,0);
		game.batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
