import javax.swing.JFrame;

public class RectangleViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleComponent component = new RectangleComponent();
		
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("See Rect Comp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(component);
		
		frame.setVisible(true);
		
	}

}
