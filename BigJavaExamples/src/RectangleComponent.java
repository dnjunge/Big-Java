import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
	
	public void paintComponent(Graphics g)
	{
		//recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Construct a rect and draw
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);
		
		// Move rect 15 units to the right and 25 units down
		//box = new Rectangle(5, 10, 20, 20);
		box.translate(15, 25);
		
		//Draw moved rectangle
		g2.draw(box);
	}

}
