import java.awt.Rectangle;

public class MoveTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle box = new Rectangle(5,10, 20, 30);
		
		//Move the Rect
		box.translate(15, 25);
		
		// Print info about the moved rect
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.println("Expected: 20");
		
		System.out.print("y: ");
		System.out.println(box.getY());
		System.out.println("Expected: 35");
		

	}

}
