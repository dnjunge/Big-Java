import javax.swing.JFrame;

public class FourRectanglePrinterViewer {

	public static void main(String[] args) {
		// 
		
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Four rects");
		
		FourRectanglePrinterComponent component = new FourRectanglePrinterComponent();
		
		frame.add(component);
		frame.setVisible(true);
		

	}

}
