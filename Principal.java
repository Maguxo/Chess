package Chess;

import javax.swing.JFrame;

public class Principal extends Diseño {
	
	public static void main(String arg[]) {
		
		Diseño diseño= new Diseño();
		
		diseño.setLayout(null);
		diseño.setSize(600,600);
		diseño.setVisible(true);
		//diseño.setUndecorated(true);
		diseño.setLocation(600,50);
		diseño.setTitle("Chess");
		diseño.setResizable(true);
		diseño.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
