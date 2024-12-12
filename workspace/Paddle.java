/*
 * Author: Jackson Hammack
 * Date: 12/09/24
 * Description: This file is meant to provide methods for BrickBreak.java, set a constructor, and create instance variables to be used in BrickBreak.java. This java
 * file regards itself with the paddle/player in the final game.
 */
import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	//your code here!
	private int XPos;
	private int YPos;
	private int Height;
	private int Width;
	private int Velocity;
	//don't forget you need instance variables:
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		XPos = x;
		YPos = y;
		Height = height;
		Width = width;
	}
	//methods:
	public int getX(){
		return XPos;
	}
	public int getY(){
		return YPos;
	}
	public int getWidth(){
		return Width;
	}
	public int getHeight(){
		return Height;
	}
	public int getVelocity(){
		return Velocity;
	}

		//Precondition: XPos, Ypos, and Velocity are all set
		//Postcondition: The paddle will move across the screen based on iputs from BrickBreak.java

	public void move(){
		XPos = XPos + Velocity;
	}

		//Velocity is set and the method is called
		//Postcondition: The paddle will increase or decrease its velocity across the screen based on iputs from BrickBreak.java

	public void addVelocity(int plus){
		Velocity = Velocity + plus;
	}
	public void setVelocity(int newVelocity){
		Velocity = newVelocity;
	}
	public void setX(int newX){
		XPos = newX;
	}

		//Precondition: XPos, Ypos, Width, and Height are all set
		//Postcondition: The paddle will be created visually on the screen at XPos, YPos

	public void draw(Graphics g){
		g.fillOval(XPos, YPos, Width, Height);
	}
}
