package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}
	float playerX, playerY, playerWidth;
	public void setup() {
		colorMode(HSB);

		playerX = width / 2;
		playerY = height * 50;
		playerWidth = 50;

		restBug();
	}
	
	private void restBug() 
	{
	
	}

	void drawPlayer(float x, float y, float w)
	{

	}
	public void draw()
	{	
        background(0);
		drawPlayer(playerX, playerY, playerWidth);
	}
}
