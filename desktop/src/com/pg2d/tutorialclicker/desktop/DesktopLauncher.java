package com.pg2d.tutorialclicker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pg2d.tutorialclicker.TutorialClicker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = TutorialClicker.GAME_NAME;
		config.width = TutorialClicker.WIDTH;
		config.height = TutorialClicker.HEIGHT;
		config.resizable = false;


		new LwjglApplication(new TutorialClicker(), config);
	}
}
