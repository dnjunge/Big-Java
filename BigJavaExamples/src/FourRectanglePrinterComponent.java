import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class FourRectanglePrinterComponent extends JComponent{
	public void paintComponent(Graphics g)
	{
	
		//recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Construct a rect and draw
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		// right rect
		box.translate(20, 0);
		
		//Draw right rectangle
		g2.draw(box);
		
		// left rect
		box.translate(-20, 30);
		
		//Draw left rectangle
		g2.draw(box);
		
		// bottom right rect
		box.translate(20, 0);
		
		//Draw right rectangle
		g2.draw(box);
	}

}
