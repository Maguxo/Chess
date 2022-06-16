package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class reina {

	private int x=7;
	private int y=3;
	private int x2=0;
	private int y2=3;
	private ImageIcon reinaN= null, reinaB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon reinaN2= new ImageIcon("src/Chess/fichas/reinaN.png");
	private ImageIcon reinaB2= new ImageIcon("src/Chess/fichas/reinaB.png");
  
    
	
	public  ImageIcon imagenBlanco() {
		reinaB= new ImageIcon(reinaB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return reinaB;
	}

	public  ImageIcon imagenNegra() {
		reinaN= new ImageIcon(reinaN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return reinaN;
	}
	
	public boolean movimiento(int i, int j) {
		int fila= Math.abs(i - this.x);
		int columna= Math.abs(j - this.y);
		
		if ((fila==1 && columna==0) || (fila==1 && columna==1) ||(fila==0 && columna==1)) {
			return true;
		}
		return false;
	}
	
	public void procesoClickN(int i, int j) {
		
		if(movimiento(i,j)== false) {
			return;
		}
		
		casilla[x][y].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		y=j;
	}
	
	public boolean movimiento2(int i, int j) {
		int fila= Math.abs(i - this.x2);
		int columna= Math.abs(j - this.y2);
		
		if ((fila==1 && columna==0) || (fila==1 && columna==1) ||(fila==0 && columna==1)) {
			return true;
		}
		return false;
	}
	
	public void procesoClickB(int i, int j) {
		
		if(movimiento2(i,j)== false) {
			return;
		}
		
		casilla[x2][y2].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		y2=j;
	}
	
	public JButton[][] getCasilla(){
		return this.casilla;
	}

}
