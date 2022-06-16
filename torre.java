package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class torre {

	private int x=7;
	private int y=0;
	private int x2=0;
	private int y2=0;
	private ImageIcon torreN= null, torreB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon torreN2= new ImageIcon("src/Chess/fichas/castilloN.png");
	private ImageIcon torreB2= new ImageIcon("src/Chess/fichas/castilloB.png");
  
    
	
	public  ImageIcon imagenBlanco() {
		torreB= new ImageIcon(torreB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return torreB;
	}

	public  ImageIcon imagenNegra() {
		torreN= new ImageIcon(torreN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return torreN;
	}
    
	public boolean movimiento(int i, int j) {
		int fila= Math.abs(i-this.x);
		int columna= Math.abs(j-this.y);
		
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;
		
	}
	public void procesoClickN(int i, int j) {
	     if(movimiento(i,j)==false) {
	    	 return;
	     }
		casilla[x][y].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		y=j;
		
		
	}
	
	public boolean movimiento2(int i, int j) {
		int fila= Math.abs(i-this.x2);
		int columna= Math.abs(j-this.y2);
		
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;
		
	}
	
	public void procesoClickB(int i, int j) {
	     if(movimiento2(i,j)==false) {
	    	 return;
	     }
		casilla[x2][y2].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		y2=j;
		
		
	}
	
	public JButton[][] getCasilla() {
		return this.casilla;
	}
}
