import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

public class MyApplet extends JApplet {
	
	public void paint(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Construct a rect and draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		//Move Rect 15 right and 25 down
		box.translate(15, 25);
		
		
	}

}
