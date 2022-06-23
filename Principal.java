package Chess;

import javax.swing.JFrame;

public class Principal extends Accionar2 {
	
	public static void main(String arg[]) {
		
		Principal diseño= new Principal();
		
		diseño.setLayout(null);
		diseño.setSize(580,630);
		diseño.setUndecorated(true);
		diseño.setVisible(true);
		diseño.setLocation(600,50);
		diseño.setTitle("Chess");
		diseño.setResizable(true);
		diseño.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
