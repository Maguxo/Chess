package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

public class torre {
	private int x=7, y=0, yn=7;
	private int x2=0,y2=0, yb=7;
	private ImageIcon torreN= null, torreB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon torreN2= new ImageIcon("src/Chess/fichas/castilloN.png");
	private ImageIcon torreB2= new ImageIcon("src/Chess/fichas/castilloB.png");
  
    public torre(JButton [][] casilla) {
    	this.casilla= casilla;
    }
	
	public  ImageIcon imagenBlanco() {
		torreB= new ImageIcon(torreB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return torreB;
	}

	public  ImageIcon imagenNegra() {
		torreN= new ImageIcon(torreN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return torreN;
	}
    
	public boolean movimientoN(int i, int j) {
		int fila= Math.abs(i-this.x);
		int columna= Math.abs(j-this.y);
		
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;	
	}
	public boolean movimientoN1(int i, int j) {
		int fila= Math.abs(i-this.x);
		int columna= Math.abs(j-this.yn);
		
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;	
	}
	public void procesoClickN(int i, int j) {
	     if(movimientoN(i,j)==false) {
	    	 return;
	     }
		casilla[x][y].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		y=j;
	}
	public void procesoClickN1(int i, int j) {
	     if(movimientoN1(i,j)==false) {
	    	 return;
	     }
		casilla[x][yn].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		yn=j;
	}
	
	public boolean movimientoB(int i, int j) {
		int fila= Math.abs(i-this.x2);
		int columna= Math.abs(j-this.y2);
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;
	}
	public boolean movimientoB1(int i, int j) {
		int fila= Math.abs(i-this.x2);
		int columna= Math.abs(j-this.yb);
		if((fila==1 && columna==0) || (fila==0 && columna==1)) {
		  return true;
		}
		    return false;
	}
	public void procesoClickB(int i, int j) {
	     if(movimientoB(i,j)==false) {
	    	 return;
	     }
		casilla[x2][y2].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		y2=j;	
	}
	public void procesoClickB1(int i, int j) {
	     if(movimientoB1(i,j)==false) {
	    	 return;
	     }
		casilla[x2][yb].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		yb=j;	
	}
	
	public JButton[][] getCasilla() {
		return this.casilla;
	}
}
