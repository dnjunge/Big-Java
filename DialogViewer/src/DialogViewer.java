import javax.swing.JOptionPane;
public class DialogViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		System.out.println(name);
		String task = JOptionPane.showInputDialog(null, "What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
		System.exit(0);
		

	}

}