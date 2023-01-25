//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
	  /* house base */
	  // text
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );
      // wall
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      // door
      window.setColor(Color.WHITE);
      window.fillRect(350, 480, 100, 120);
      // window
      window.setColor(Color.YELLOW);
      window.fillRect(270, 320, 80, 80);
      window.fillRect(450, 320, 80, 80);
      // roof
      window.setColor(Color.GREEN);
      window.fillRect(100, 120, 600, 100);
      
      /* trees */
      // trunks
      window.setColor(new Color(140, 76, 4));
      window.fillRect(100, 550, 50, 50);
      window.fillRect(650, 550, 50, 50);
      // leaves
      window.setColor(new Color(5, 140, 4));
      int x1[] = {75, 125, 175};
      int x2[] = {625, 675, 725};
      int y1[] = {550, 500, 550};
      int y2[] = {525, 475, 525};
      int y3[] = {500, 450, 500};
      int y4[] = {475, 425, 475};
      window.fillPolygon(x1, y1, 3);
      window.fillPolygon(x1, y2, 3);
      window.fillPolygon(x1, y3, 3);
      window.fillPolygon(x1, y4, 3);
      window.fillPolygon(x2, y1, 3);
      window.fillPolygon(x2, y2, 3);
      window.fillPolygon(x2, y3, 3);
      window.fillPolygon(x2, y4, 3);

   }
}