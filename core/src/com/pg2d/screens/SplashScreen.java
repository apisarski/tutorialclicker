package com.pg2d.screens;

import com.badlogic.gdx.graphics.Texture;
import com.pg2d.tutorialclicker.TutorialClicker;

public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(TutorialClicker game) {
        super(game);
        init();
    }

    private void init(){
        // TODO implement assetManager
        splashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(splashImg,0,0);

        spriteBatch.end();
    }
}
