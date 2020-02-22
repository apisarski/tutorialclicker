package com.pg2d.tutorialclicker;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.pg2d.screens.SplashScreen;

public class TutorialClicker extends Game {
	public static final String GAME_NAME = "Tutorial Clicker";

	public static final int WIDTH = 480;
	public static final int HEIGHT = 700;

	private boolean paused;


	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}

	// ** getters and setters ** \\

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
