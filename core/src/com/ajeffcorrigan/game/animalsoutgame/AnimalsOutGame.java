package com.ajeffcorrigan.game.animalsoutgame;

import com.ajeffcorrigan.game.animalsoutgame.screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class AnimalsOutGame extends Game {
	//Game size.
	public static int GH;
	public static int GW;
    public SpriteBatch sb;
    
    @Override
    public void create () {
        GH = Gdx.graphics.getWidth();
        GW = Gdx.graphics.getHeight();
        
        sb = new SpriteBatch();
        setScreen(new PlayScreen(this));
    }

    @Override
    public void render () {
    	super.render();
    }

}
