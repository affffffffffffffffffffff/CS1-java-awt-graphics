//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
		Shape s1 = new Shape(100, 150, 97, 100, new Color(104, 20, 157));
		//tell your shape to draw
		s1.draw(window);

		//instantiate a Shape
		Shape s2 = new Shape(500, 50, 194, 200, new Color(24, 90, 189));
		//tell your shape to draw
		s2.draw(window);

		//instantiate a Shape
		Shape s3 = new Shape(250, 250, 281, 300, new Color(29, 111, 66));
		//tell your shape to draw
		s3.draw(window);
		
		//instantiate a Shape
		Shape s4 = new Shape(600, 300, 378, 400, new Color(208, 68, 35));
		//tell your shape to draw
		s4.draw(window);
	}
}