/*
 * Author: Jackson Hammack
 * Date: 12/09/24
 * Description: This file is meant to provide methods for BrickBreak.java, set a constructor, and create instance variables to be used in BrickBreak.java. This java
 * file regards itself with the ball in the final game.
 */



import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int XPos;
	private int YPos;
	private int size;
	private int XVelocity;
	private int YVelocity;
	//constructor(s):
	public Ball(int x, int y, int Size){
		XPos = x;
		YPos = y;
		size = Size;
	}
	//methods:
	public int getXpos(){
		return XPos;
	}
	public int getYpos(){
		return YPos;
	}
	public int getSize(){
		return size;
		//Precondition: Y is an integer.
		//Postcondition: Y will become its opposite (for example 3 would become -3)
	}
	public void reverseY(){
		YVelocity = -YVelocity;
	}
		//Precondition: X is an integer.
		//Postcondition: X will become its opposite (for example 3 would become -3)
	public void reverseX(){
		XVelocity = -XVelocity;
	}
	public void setXVelocity(int SpeedX){
		XVelocity = SpeedX;
	}
	public void setYVelocity(int SpeedY){
		YVelocity = SpeedY;
	}
	public void setX(int newX){
		XPos = newX;
	}
	public void setY(int newY){
		YPos = newY;
	}
		//Precondition: XPos, Ypos, XVelocity, and YVelocity are all set
		//Postcondition: The ball will move across the screen based on iputs from BrickBreak.java

	public void move(){
		XPos = XPos + XVelocity;
		YPos = YPos + YVelocity;
	}
		//Precondition: XPos, Ypos, and size are all set
		//Postcondition: The ball will be created visually on the screen at XPos, YPos

	public void draw(Graphics g){
		g.fillOval(XPos, YPos, size, size);
	}
}
