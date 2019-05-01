import javax.swing.JFrame;

public class EmptyFrameViewer {

	public static void main(String[] args) {
		// 
		
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		//self check
		JFrame frame2 = new JFrame();
		
		frame2.setSize(400, 400);
		frame2.setTitle("Hello World1");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame2.setVisible(true);
		

	}

}
