package com.ajeffcorrigan.game.animalsoutgame.screens;

import com.ajeffcorrigan.game.animalsoutgame.AnimalsOutGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class PlayScreen implements Screen {

	private AnimalsOutGame game;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    
    //Tiled map variables
    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
	
	public PlayScreen(AnimalsOutGame game) {
		this.game = game;
        
		//create cam
        gamecam = new OrthographicCamera();

        //create a FitViewport to maintain virtual aspect ratio despite screen size
        //gamePort = new FitViewport(AnimalsOutGame.gw, AnimalsOutGame.gh, gamecam);
        
        //Load our map and setup our map renderer
        maploader = new TmxMapLoader();
        map = maploader.load("sample_indoor.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		update(delta);
		
        //Clear the game screen with Black
        Gdx.gl.glClearColor(0, .3f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.render();
	}

	public void update(float dt) {
		renderer.setView(gamecam);
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
