package Chess;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Diseño extends JFrame {

	private JPanel panel, panel2;
	private JButton[][] casilla;
	private JLabel cierreV;
	private Boolean pose= true;
	
	
	public Diseño() {
		
		diseñoLogo();
		base();
		estructura();
	}
	
	public void diseñoLogo() {
		
		Image logo= new ImageIcon(getClass().getResource("imagenes/Chess.jpg")).getImage();
	      this.setIconImage(logo);
	}
	
	public void base() {
	
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,580,640);
		panel.setBackground(Color.yellow);
		this.getContentPane().add(panel);
		
		panel2= new JPanel();
		panel2.setBounds(0,50,580,580);
		panel2.setBackground(new Color(67,168,217));
		panel.add(panel2);
		
		cierreV= new JLabel();
		cierreV.setText("X");
		cierreV.setFont(new Font("Segoe Script",6,26));
		cierreV.setBounds(0,0,50,50);
		cierreV.setBackground(new Color(67,168,217));
		cierreV.setHorizontalAlignment(SwingConstants.CENTER);
		cierreV.setVerticalAlignment(SwingConstants.CENTER);
		cierreV.setOpaque(true);
		panel.add(cierreV);
	}
	
	public void estructura() {
		
		panel2.setLayout(new GridLayout(8,8,1,1));
		  casilla= new JButton[8][8];
		    for(int i=0; i<casilla.length; i++) {	
	          for(int j=0; j< casilla[i].length; j++) {
		        casilla[i][j]= new JButton();
			      if( (i+j)%2== 0) {casilla[i][j].setBackground(Color.white);
		        }else {casilla[i][j].setBackground(Color.BLACK);}
              panel2.add(casilla[i][j]);}
		      }
	          }
	
	public JPanel getPanel() {return this.panel;}
	public JLabel getCierrev() {return this.cierreV;}
}
