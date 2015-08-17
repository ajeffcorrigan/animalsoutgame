package com.ajeffcorrigan.game.animalsoutgame.screens;

import com.ajeffcorrigan.game.animalsoutgame.AnimalsOutGame;
import com.ajeffcorrigan.game.animalsoutgame.tools.jAssets;
import com.badlogic.gdx.Screen;

public class GameScreen implements Screen {
	
	private AnimalsOutGame game;
	
	public GameScreen(AnimalsOutGame aog) {
		game = aog;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		game.batch.begin();
		game.batch.draw(jAssets.getTexture("logo"), 100,100);
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
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
