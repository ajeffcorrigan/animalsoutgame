package com.ajeffcorrigan.game.animalsoutgame.states;

import com.ajeffcorrigan.game.animalsoutgame.tools.GameStateManager;
import com.ajeffcorrigan.game.animalsoutgame.tools.State;
import com.ajeffcorrigan.game.animalsoutgame.tools.jAssets;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IntroState extends State {

	private float introTimer = 0.0f;							//Timer variable to show splash screen.
	private boolean assetsInit = false;							//Checks if assets have loaded.
	
	public IntroState(GameStateManager gsm) {
		super(gsm);
		jAssets.loadTextureAs("logo", "badlogic.jpg");
    	jAssets.loadTextureAs("spritesheet", "roguelikeSheet_transparent.png");
    	jAssets.loadTextureAs("round", "round.png");
    	jAssets.loadTextureAs("roundoutline", "round_outline.png");
    	jAssets.createTextureRegion("pass", "spritesheet", 16, 64, 16, 16);
    	jAssets.createTextureRegion("monkeyround", "round", 0, 282, 310, 260);
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
	}

	@Override
	public void render(SpriteBatch sb) {
		

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	public void loadAssets() {
    	jAssets.loadTextureAs("spritesheet", "roguelikeSheet_transparent.png");
    	jAssets.loadTextureAs("round", "round.png");
    	jAssets.loadTextureAs("roundoutline", "round_outline.png");
    	jAssets.createTextureRegion("pass", "spritesheet", 16, 64, 16, 16);
    	jAssets.createTextureRegion("monkeyround", "round", 0, 282, 310, 260);
    	assetsInit = true;
	}

}
