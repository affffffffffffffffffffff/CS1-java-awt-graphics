//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      //add more code here
      // spooky eyes
      window.setColor(Color.GREEN);
      window.fillOval(290, 200, 80, 40);
      window.fillOval(450, 200, 80, 40);
      
      // weird nose
      window.setColor(Color.BLACK);
      window.fillOval(385, 280, 50, 50);
      
      // cursed mouth
      window.setColor(Color.RED);
      window.drawArc(330, 370, 160, 40, -10, -160);
      

   }
}