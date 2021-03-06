package graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A car shape that can be positioned anywhere on the screen
 * @author Dan
 *
 */
public class Car {
	
	private int xLeft;
	private int yTop;

	/**
	 * Constructs a car witha given top-left corner.
	 * @param x the x-cood 
	 * @param y the y-cood
	 */
	public Car(int x, int y)
	{
		this.xLeft = x;
		this.yTop =y;
	}
	
	/**
	 * Draws the car.
	 * @param g2 the graphics context
	 */
	
	public void draw(Graphics2D g2)
	{
		Rectangle body
			= new Rectangle(this.xLeft, this.yTop + 10, 60, 10);
		Ellipse2D.Double frontTire
			= new Ellipse2D.Double(this.xLeft + 10, this.yTop + 20, 10, 10);
		Ellipse2D.Double rearTire
		= new Ellipse2D.Double(this.xLeft + 40, this.yTop + 20, 10, 10);
		
		// Bottom of the front windshield
		Point2D.Double r1
			= new Point2D.Double(this.xLeft + 10, this.yTop +10);
		// Bottom of the roof
		Point2D.Double r2
			= new Point2D.Double(this.xLeft + 20, this.yTop);
		// Rear of the roof
		Point2D.Double r3
			= new Point2D.Double(this.xLeft + 40, this.yTop);
		// Bottom of the rear windshield
		Point2D.Double r4
			= new Point2D.Double(this.xLeft + 50, this.yTop +10);
		
		Line2D.Double frontWindshield
			= new Line2D.Double(r1, r2);
		Line2D.Double roofTop
			= new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield
			= new Line2D.Double(r3, r4);	
		
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
			
		
	}
	
	
}
