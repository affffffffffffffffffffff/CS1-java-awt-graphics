//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
	  // gradient
      window.setColor(darkenColor(darkenColor(color)));
      window.fillRect(xPos, yPos, width*5/6, height);
      window.setColor(darkenColor(color));
      window.fillRect(xPos, yPos, width*5/6, height*3/4);
      window.setColor(lightenColor(color));
      window.fillRect(xPos, yPos, width*5/6, height*2/4);
      window.setColor(lightenColor(lightenColor(color)));
      window.fillRect(xPos, yPos, width*5/6, height*1/4);
      // letterbox
      window.setColor(color);
      window.fillRect(xPos-width/6, yPos+height/5, width/5*3, height/5*3);
      // letter
      /*
      int lwidth = xPos-width/5 + width/5*3;
      int lheight = yPos+height/5 + height*3/5;
      int xTrap[] = {lwidth/6, lwidth/6*5, lwidth/5*4, lwidth/5};
      int yTrap[] = {lheight/6, lheight/6, lheight/6*5, lheight/6*5};
      int xTri1[] = {lwidth/7*2, lwidth*5/14, lwidth/7*3};
      int yTri1[] = {lheight/6, lheight/2, lheight/6};
      int xTri2[] = {lwidth/7*3, lwidth*7/14, lwidth/7*4};
      int yTri2[] = {lheight/6*5, lheight/2, lheight/6*5};
      int xTri3[] = {lwidth/7*4, lwidth*9/14, lwidth/7*5};
      int yTri3[] = {lheight/6, lheight/2, lheight/6};
      window.setColor(color.WHITE);
      window.fillPolygon(xTrap, yTrap, 4);
      window.setColor(color);
      window.fillPolygon(xTri1, yTri1, 3);
      window.fillPolygon(xTri2, yTri2, 3);
      window.fillPolygon(xTri3, yTri3, 3);
	  */
      window.setColor(color.WHITE);

      window.fillOval(xPos-width/8, yPos+height/4, width/6*3, height/6*3);

   }

   // getter
   public int getX() {
	   return xPos;
   }
   public int getY() {
	   return yPos;
   }
   public int getWidth() {
	   return width;
   }
   public int getHeight() {
	   return height;
   }
   public Color getColor() {
	   return color;
   }

   // mutator
   public void setX(int newX) {
	   xPos = newX;
   }
   public void setY(int newY) {
	   yPos = newY;
   }
   public void setWidth(int newWidth) {
	  width = newWidth;
   }
   public void setHeight(int newHeight) {
	   height = newHeight;
   }
   public void setColor(Color newColor) {
	   color = newColor;
   }
   
   //auxiliary
   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
   private Color darkenColor(Color x) {
	   Color y = new Color(((x.getRed()-50)>0 ? x.getRed()-50 : 0), ((x.getGreen()-50)>0 ? x.getGreen()-50 : 0), ((x.getBlue()-50)>0 ? x.getBlue()-50 : 0));
	   return y;
   }
   private Color lightenColor(Color x) {
	   Color y = new Color(((x.getRed()+50)<255 ? x.getRed()+50 : 255), ((x.getGreen()+50)<255 ? x.getGreen()+50 : 255), ((x.getBlue()+50)<255 ? x.getBlue()+50 : 255));
	   return y;
   }
}