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

public class Diseño extends JFrame {

	private JPanel      panel, panel2;
	private JButton[][] casilla;
	private JLabel      cierreV;
	private JLabel      castilloB, castillo2B, caballoB, caballo2B, alfilB, alfil2B, reinaB, reyB,
	                    peon1,     peon2,      peon3,    peon4,     peon5,  peon6,   peon7,  peon8,
	                    castilloN, castillo2N, caballoN, caballo2N, alfilN, alfil2N, reinaN, reyN,
	                    peon21,     peon22,      peon23,    peon24,     peon25,  peon26,   peon27,  peon28;
	                    
	public Diseño() {
		
		diseñoLogo();
		base();
		estructura();
		fichasB();
		fichasN();
	}
	
	public void fichasN() {
	
		ImageIcon imagen1,imagen2,imagen3,imagen4,imagen5,imagen6, imagen7,imagen8,
        imagenD1,imagenD2,imagenD3,imagenD4,imagenD5,imagenD6, imagenD7,imagenD8,
        p1,      p2,      p3,      p4,      p5,      p6,       p7,      p8,
        p1D,     p2D,     p3D,     p4D,     p5D,     p6D,      p7D,     p8D;
                  
        p1=new ImageIcon("src/Chess/fichas/peonN.png");
        p2=new ImageIcon("src/Chess/fichas/peonN.png");
        p3=new ImageIcon("src/Chess/fichas/peonN.png");
        p4=new ImageIcon("src/Chess/fichas/peonN.png");
        p5=new ImageIcon("src/Chess/fichas/peonN.png");
        p6=new ImageIcon("src/Chess/fichas/peonN.png");
        p7=new ImageIcon("src/Chess/fichas/peonN.png");
        p8=new ImageIcon("src/Chess/fichas/peonN.png");

        p1D=new ImageIcon(p1.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p2D=new ImageIcon(p2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p3D=new ImageIcon(p3.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p4D=new ImageIcon(p4.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p5D=new ImageIcon(p5.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p6D=new ImageIcon(p6.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p7D=new ImageIcon(p7.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
        p8D=new ImageIcon(p8.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));

        peon21= new JLabel();
        peon22= new JLabel();
        peon23= new JLabel();
        peon24= new JLabel();
        peon25= new JLabel();
        peon26= new JLabel();
        peon27= new JLabel();
        peon28= new JLabel();

        peon21.setIcon(p1D);
        peon22.setIcon(p2D);
        peon23.setIcon(p3D);
        peon24.setIcon(p4D);
        peon25.setIcon(p5D);
        peon26.setIcon(p6D);
        peon27.setIcon(p7D);
        peon28.setIcon(p8D);

        casilla[6][0].add(peon21);
        casilla[6][1].add(peon22);
        casilla[6][2].add(peon23);
        casilla[6][3].add(peon24);
        casilla[6][4].add(peon25);
        casilla[6][5].add(peon26);
        casilla[6][6].add(peon27);
        casilla[6][7].add(peon28);

        imagen1=new ImageIcon("src/Chess/fichas/castilloN.png");
        imagen2=new ImageIcon("src/Chess/fichas/castilloN.png");
        imagen3=new ImageIcon("src/Chess/fichas/caballoN.png");
        imagen4=new ImageIcon("src/Chess/fichas/caballoN.png");
        imagen5=new ImageIcon("src/Chess/fichas/alfilN.png");
        imagen6=new ImageIcon("src/Chess/fichas/alfilN.png");
        imagen7=new ImageIcon("src/Chess/fichas/reinaN.png");
        imagen8=new ImageIcon("src/Chess/fichas/reyN.png");

       imagenD1=new ImageIcon(imagen1.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD2=new ImageIcon(imagen2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD3=new ImageIcon(imagen3.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD4=new ImageIcon(imagen4.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD5=new ImageIcon(imagen5.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD6=new ImageIcon(imagen6.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD7=new ImageIcon(imagen7.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
       imagenD8=new ImageIcon(imagen8.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));

       castilloN= new JLabel();
       castillo2N= new JLabel();
       caballoN= new JLabel();
       caballo2N= new JLabel();
       alfilN= new JLabel();
       alfil2N= new JLabel();
       reinaN= new JLabel();
       reyN= new JLabel();

      castilloN.setIcon(imagenD1);
      castillo2N.setIcon(imagenD2);
      caballoN.setIcon(imagenD3);
      caballo2N.setIcon(imagenD4);
      alfilN.setIcon(imagenD5);
      alfil2N.setIcon(imagenD6);
      reinaN.setIcon(imagenD7);
      reyN.setIcon(imagenD8);

	    casilla[7][0].add(castilloN);
		casilla[7][7].add(castillo2N);
		casilla[7][1].add(caballoN);
		casilla[7][6].add(caballo2N);
		casilla[7][2].add(alfilN);
		casilla[7][5].add(alfil2N);
		casilla[7][3].add(reinaN);
		casilla[7][4].add(reyN);

	}
	public void fichasB() {
		
		ImageIcon imagen1,imagen2,imagen3,imagen4,imagen5,imagen6, imagen7,imagen8,
		          imagenD1,imagenD2,imagenD3,imagenD4,imagenD5,imagenD6, imagenD7,imagenD8,
		          p1,      p2,      p3,      p4,      p5,      p6,       p7,      p8,
		          p1D,     p2D,     p3D,     p4D,     p5D,     p6D,      p7D,     p8D;
		                    
		p1=new ImageIcon("src/Chess/fichas/peonB.png");
		p2=new ImageIcon("src/Chess/fichas/peonB.png");
		p3=new ImageIcon("src/Chess/fichas/peonB.png");
		p4=new ImageIcon("src/Chess/fichas/peonB.png");
		p5=new ImageIcon("src/Chess/fichas/peonB.png");
		p6=new ImageIcon("src/Chess/fichas/peonB.png");
		p7=new ImageIcon("src/Chess/fichas/peonB.png");
		p8=new ImageIcon("src/Chess/fichas/peonB.png");
		
		p1D=new ImageIcon(p1.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p2D=new ImageIcon(p2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p3D=new ImageIcon(p3.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p4D=new ImageIcon(p4.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p5D=new ImageIcon(p5.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p6D=new ImageIcon(p6.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p7D=new ImageIcon(p7.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		p8D=new ImageIcon(p8.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		
		peon1= new JLabel();
		peon2= new JLabel();
		peon3= new JLabel();
		peon4= new JLabel();
		peon5= new JLabel();
		peon6= new JLabel();
		peon7= new JLabel();
		peon8= new JLabel();
		
		peon1.setIcon(p1D);
		peon2.setIcon(p2D);
		peon3.setIcon(p3D);
		peon4.setIcon(p4D);
		peon5.setIcon(p5D);
		peon6.setIcon(p6D);
		peon7.setIcon(p7D);
		peon8.setIcon(p8D);
		
		casilla[1][0].add(peon1);
		casilla[1][1].add(peon2);
		casilla[1][2].add(peon3);
		casilla[1][3].add(peon4);
		casilla[1][4].add(peon5);
		casilla[1][5].add(peon6);
		casilla[1][6].add(peon7);
		casilla[1][7].add(peon8);
		
		imagen1=new ImageIcon("src/Chess/fichas/castilloB.png");
		imagen2=new ImageIcon("src/Chess/fichas/castilloB.png");
		imagen3=new ImageIcon("src/Chess/fichas/caballoB.png");
		imagen4=new ImageIcon("src/Chess/fichas/caballoB.png");
		imagen5=new ImageIcon("src/Chess/fichas/alfilB.png");
		imagen6=new ImageIcon("src/Chess/fichas/alfilB.png");
		imagen7=new ImageIcon("src/Chess/fichas/reinaB.png");
		imagen8=new ImageIcon("src/Chess/fichas/reyB.png");
		
		imagenD1=new ImageIcon(imagen1.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD2=new ImageIcon(imagen2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD3=new ImageIcon(imagen3.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD4=new ImageIcon(imagen4.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD5=new ImageIcon(imagen5.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD6=new ImageIcon(imagen6.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD7=new ImageIcon(imagen7.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		imagenD8=new ImageIcon(imagen8.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		
		castilloB= new JLabel();
		castillo2B= new JLabel();
		caballoB= new JLabel();
		caballo2B= new JLabel();
		alfilB= new JLabel();
		alfil2B= new JLabel();
		reinaB= new JLabel();
		reyB= new JLabel();
		
		castilloB.setIcon(imagenD1);
		castillo2B.setIcon(imagenD2);
		caballoB.setIcon(imagenD3);
		caballo2B.setIcon(imagenD4);
		alfilB.setIcon(imagenD5);
		alfil2B.setIcon(imagenD6);
		reinaB.setIcon(imagenD7);
		reyB.setIcon(imagenD8);
		
			    casilla[0][0].add(castilloB);
				casilla[0][7].add(castillo2B);
				casilla[0][1].add(caballoB);
				casilla[0][6].add(caballo2B);
				casilla[0][2].add(alfilB);
				casilla[0][5].add(alfil2B);
				casilla[0][3].add(reinaB);
				casilla[0][4].add(reyB);
		
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
