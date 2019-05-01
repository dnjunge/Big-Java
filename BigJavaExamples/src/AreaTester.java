import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {
		
		
		Rectangle box = new Rectangle(5,10, 20, 30);
		

		// Print info about the area of rect
		
		System.out.print("Area: ");
		System.out.println(box.getWidth() * box.getHeight());
		System.out.println("Expected: 600");
		
		// Print info about the perimeter of rect
		
		System.out.print("Perimeter: ");
		System.out.println(2* (box.getWidth() + box.getHeight()));
		System.out.println("Expected: 100");
		

	}

}
