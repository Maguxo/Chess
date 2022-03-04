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
	private JButton[] casilla;
	private JLabel cierreV;
	private Boolean pose= true;
	
	public Diseño() {
		
		diseñoLogo();
		base();
		estructura();
	}
	
	public void diseñoLogo() {
		
		Image logo= new ImageIcon(getClass().getResource("logo/chess.png")).getImage();
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
		  casilla= new JButton[64];
		    for(int i=0; i<casilla.length; i++) {
			  casilla[i]= new JButton();
		      if(i==1 || i==3 || i== 5 || i==7 ||i==8 || i==10 || i== 12 || i==14 ||
		         i==17 || i==19 || i== 21 ||i==23 ||i==24 || i==26 || i== 28 || i==30 ||
		         i==33 || i==35|| i== 37 || i==39 || i==40 || i==42 || i== 44 || i==46 ||
		         i==49 || i==51 || i== 53 || i==55 ||i==56 || i== 58 || i== 60 || i==62){
		    	  casilla[i].setBackground(Color.black);
		      }else {casilla[i].setBackground(Color.white);}  
			   
				  
		          casilla[i].setOpaque(true);
		            panel2.add(casilla[i]);
		            }
	}
	
	public JPanel getPanel() {return this.panel;}
	public JLabel getCierrev() {return this.cierreV;}
}
