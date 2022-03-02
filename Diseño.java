package Chess;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Diseño extends JFrame {

	public Diseño() {
		
		diseñoLogo();
	}
	
	public void diseñoLogo() {
		
		Image logo= new ImageIcon(getClass().getResource("logo/chess.png")).getImage();
	     this.setIconImage(logo);
	}
}
