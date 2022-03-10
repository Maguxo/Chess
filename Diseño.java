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
import java.util.ArrayList;
import java.util.LinkedList;

public class Diseño extends JFrame {

	private JPanel      panel, panel2;
	private JButton[][] casilla;
	private JLabel      cierreV;
	private JLabel[]    piezasN= new JLabel[16];
	private JLabel[]    piezasB= new JLabel[16];
	
	public Diseño() {
		
		diseñoLogo();
		base();
		estructura();
		fichasB();
		fichasN();   
	}
	
	public void fichasN() {
		 ImageIcon[] atrapaImagen= new ImageIcon[16];
		 ImageIcon[] atrapaImagen2= new ImageIcon[16];
		
	    atrapaImagen[0]= new ImageIcon("src/Chess/fichas/castilloN.png");
        atrapaImagen[1]=new ImageIcon("src/Chess/fichas/castilloN.png");
        atrapaImagen[2]=new ImageIcon("src/Chess/fichas/caballoN.png");
        atrapaImagen[3]=new ImageIcon("src/Chess/fichas/caballoN.png");
        atrapaImagen[4]=new ImageIcon("src/Chess/fichas/alfilN.png");
        atrapaImagen[5]=new ImageIcon("src/Chess/fichas/alfilN.png");
        atrapaImagen[6]=new ImageIcon("src/Chess/fichas/reinaN.png");
        atrapaImagen[7]=new ImageIcon("src/Chess/fichas/reyN.png");
        atrapaImagen[8]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[9]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[10]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[11]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[12]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[13]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[14]=new ImageIcon("src/Chess/fichas/peonN.png");
        atrapaImagen[15]=new ImageIcon("src/Chess/fichas/peonN.png");
        
        for(int i=0; i<atrapaImagen.length; i++) {
         	  atrapaImagen2[i]= new ImageIcon(atrapaImagen[i].getImage().getScaledInstance(36, 50, Image.SCALE_AREA_AVERAGING));}
                for(int i=0; i<atrapaImagen2.length; i++) {
                  piezasN[i]= new JLabel(); piezasN[i].setIcon(atrapaImagen2[i]);}
       
        casilla[6][0].add(piezasN[8]);
        casilla[6][7].add(piezasN[9]);
        casilla[6][1].add(piezasN[10]);
        casilla[6][6].add(piezasN[11]);
        casilla[6][2].add(piezasN[12]);
        casilla[6][5].add(piezasN[13]);
        casilla[6][3].add(piezasN[14]);
        casilla[6][4].add(piezasN[15]);
	    casilla[7][0].add(piezasN[0]);
	    casilla[7][7].add(piezasN[1]);
		casilla[7][1].add(piezasN[2]);
		casilla[7][6].add(piezasN[3]);
		casilla[7][2].add(piezasN[4]);
		casilla[7][5].add(piezasN[5]);
		casilla[7][3].add(piezasN[6]);
		casilla[7][4].add(piezasN[7]);
	}
	
	public void fichasB() {
		 ImageIcon[] atrapaImagen= new ImageIcon[16];
		 ImageIcon[] atrapaImagen2= new ImageIcon[16];
		    
		    atrapaImagen[0]=new ImageIcon("src/Chess/fichas/castilloB.png");
			atrapaImagen[1]=new ImageIcon("src/Chess/fichas/castilloB.png");
			atrapaImagen[2]=new ImageIcon("src/Chess/fichas/caballoB.png");
			atrapaImagen[3]=new ImageIcon("src/Chess/fichas/caballoB.png");
			atrapaImagen[4]=new ImageIcon("src/Chess/fichas/alfilB.png");
			atrapaImagen[5]=new ImageIcon("src/Chess/fichas/alfilB.png");
			atrapaImagen[6]=new ImageIcon("src/Chess/fichas/reinaB.png");
			atrapaImagen[7]=new ImageIcon("src/Chess/fichas/reyB.png");
		    atrapaImagen[8]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[9]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[10]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[11]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[12]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[13]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[14]=new ImageIcon("src/Chess/fichas/peonB.png");
			atrapaImagen[15]=new ImageIcon("src/Chess/fichas/peonB.png");
				
			for(int i=0; i <atrapaImagen.length;i++) {
				atrapaImagen2[i]= new ImageIcon(atrapaImagen[i].getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));}
		          for(int i=0; i < atrapaImagen2.length; i++) {
		        	    piezasB[i]= new JLabel();piezasB[i].setIcon(atrapaImagen2[i]);}
		          
		    casilla[1][0].add(piezasB[8]);
		    casilla[1][7].add(piezasB[9]);
		    casilla[1][1].add(piezasB[10]);
		    casilla[1][6].add(piezasB[11]);
		    casilla[1][2].add(piezasB[12]);
		    casilla[1][5].add(piezasB[13]);
		    casilla[1][3].add(piezasB[14]);
		    casilla[1][4].add(piezasB[15]);
		  	casilla[0][0].add(piezasB[0]);
		  	casilla[0][7].add(piezasB[1]);
		    casilla[0][1].add(piezasB[2]);
		    casilla[0][6].add(piezasB[3]);
		    casilla[0][2].add(piezasB[4]);
		    casilla[0][5].add(piezasB[5]);
		    casilla[0][3].add(piezasB[6]);
		    casilla[0][4].add(piezasB[7]);      
	}
	
	public void diseñoLogo() {
		
		Image logo= new ImageIcon(getClass().getResource("logo/Chess.jpg")).getImage();
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
			      casilla[i][j].setOpaque(true);
			      panel2.add(casilla[i][j]);}          
		      }
	          }
	
	public JPanel getPanel() {return this.panel;}
	public JLabel getCierrev() {return this.cierreV;}
}