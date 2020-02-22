package com.pg2d.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.pg2d.tutorialclicker.TutorialClicker;

public abstract class AbstractScreen implements Screen {
    protected TutorialClicker game;
    protected Stage stage;
    protected SpriteBatch spriteBatch;

    private OrthographicCamera camera;


    public AbstractScreen(TutorialClicker game) {
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(TutorialClicker.WIDTH, TutorialClicker.HEIGHT, camera));
        spriteBatch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);

    }

    public void createCamera(){
        camera = new OrthographicCamera();
        camera.setToOrtho(false, TutorialClicker.WIDTH,TutorialClicker.HEIGHT);
        camera.update();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);

    }

    private void clearScreen(){
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {
        game.setPaused(true);
    }

    @Override
    public void resume() {
        game.setPaused(false);
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        game.dispose();
    }


}
