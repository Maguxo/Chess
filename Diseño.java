package Chess;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Diseño extends JFrame  {

	private JPanel    panel, panel2;
	private JLabel    cierreV;
	private JButton   casilla[][]= new JButton[8][8];
	private peon fichaPeon= new peon();
    private torre fichaTorre= new torre();
    private caballo fichaCaballo= new caballo();
    private alfil fichaAlfil= new alfil();
    private reina fichaReina= new reina();
    private rei fichaRey= new rei();
    
	public Diseño() {
		//this.casilla=fichaPeon.getCasilla();
		//this.casilla=fichaTorre.getCasilla();
		//this.casilla= fichaCaballo.getCasilla();
		//this.casilla= fichaAlfil.getCasilla();
		//this.casilla= fichaReina.getCasilla();
		this.casilla= fichaRey.getCasilla();
		diseñoLogo();    
		base();
		estructura();
		posicionInicialB();
	    posicionInicialN();
	   
	}
		
	public void posicionInicialN() {
      for(int i=0; i<=7; i++) {
	    casilla[6][i].setIcon(fichaPeon.imagenNegra());
      }
	    casilla[7][0].setIcon(fichaTorre.imagenNegra());
	    casilla[7][1].setIcon(fichaCaballo.imagenNegra());
	    casilla[7][2].setIcon(fichaAlfil.imagenNegra());
	    casilla[7][3].setIcon(fichaReina.imagenNegra());
	    casilla[7][4].setIcon(fichaRey.imagenNegra());
	    casilla[7][5].setIcon(fichaAlfil.imagenNegra());
	    casilla[7][6].setIcon(fichaCaballo.imagenNegra());
	    casilla[7][7].setIcon(fichaTorre.imagenNegra());
	}
     
	public void posicionInicialB() {
		for(int i=0; i<=7; i++) {
		casilla[1][i].setIcon(fichaPeon.imagenBlanco());
		}
		casilla[0][0].setIcon(fichaTorre.imagenBlanco());
		casilla[0][1].setIcon(fichaCaballo.imagenBlanco());
		casilla[0][2].setIcon(fichaAlfil.imagenBlanco());
		casilla[0][3].setIcon(fichaReina.imagenBlanco());
		casilla[0][4].setIcon(fichaRey.imagenBlanco());
		casilla[0][5].setIcon(fichaAlfil.imagenBlanco());
		casilla[0][6].setIcon(fichaCaballo.imagenBlanco());
		casilla[0][7].setIcon(fichaTorre.imagenBlanco());
	}
	
	public void diseñoLogo() {	
		Image logo= new ImageIcon(getClass().getResource("logo/descarga.png")).getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
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
		    for(int i=0; i<casilla.length; i++) {	
	          for(int j=0; j< casilla[i].length; j++) {
		        casilla[i][j]= new JButton();
			      if( (i+j)%2== 0) {
			    	  casilla[i][j].setBackground(Color.white);
		        }else {
		        	casilla[i][j].setBackground(Color.BLACK);
		        	} 
			      casilla[i][j].setOpaque(true);
			      panel2.add(casilla[i][j]);
			      }          
		      }
	          }
	
	public peon getPeon() {
		return this.fichaPeon;
	}
	
	public torre getTorre() {
		return this.fichaTorre;
	}
	
	public caballo getCaballo() {
		return this.fichaCaballo;
	}
	
	public alfil getAlfil() {
		return this.fichaAlfil;
	}
	
	public reina getReina() {
		return this.fichaReina;
	}
	
	public rei getRei() {
		return this.fichaRey;
	}
	
	public JButton[][] getCasilla(){
		return this.casilla;
		}
	
	public JPanel getPanel() {
		return this.panel;
		}
	
    public JLabel getCierreV() {
	   return this.cierreV;
   }
      
}