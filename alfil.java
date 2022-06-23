package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

public class alfil {
	private int x=7,y=2,yn=5;
	private int x2=0,y2=2,yb=5;
	private ImageIcon alfilN= null, alfilB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon alfilN2= new ImageIcon("src/Chess/fichas/alfilN.png");
	private ImageIcon alfilB2= new ImageIcon("src/Chess/fichas/alfilB.png");
  
    public alfil(JButton[][] casilla) {
    	this.casilla= casilla;
    }
	
	public  ImageIcon imagenBlanco() {
		alfilB= new ImageIcon(alfilB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return alfilB;
	}

	public  ImageIcon imagenNegra() {
		alfilN= new ImageIcon(alfilN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return alfilN;
	}
	public boolean movimientoN(int i, int j) {
		int fila= Math.abs(i - this.x);
		int columna= Math.abs(j - this.y);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	public boolean movimientoN1(int i, int j) {
		int fila= Math.abs(i - this.x);
		int columna= Math.abs(j - this.yb);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	public void pricesoClickN(int i, int j) {
		if(movimientoN(i,j)==false) {
			return ;
		}
		casilla[x][y].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		y=j;
		
	}
	public void pricesoClickN1(int i, int j) {
		if(movimientoN1(i,j)==false) {
			return ;
		}
		casilla[x][yb].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		yb=j;	
	}
	public boolean movimientoB(int i, int j) {
		int fila= Math.abs(i - this.x2);
		int columna= Math.abs(j - this.y2);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	public boolean movimientoB1(int i, int j) {
		int fila= Math.abs(i - this.x2);
		int columna= Math.abs(j - this.yb);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	
	public void pricesoClickB(int i, int j) {
		if(movimientoB(i,j)==false) {
			return ;
		}
		casilla[x2][y2].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		y2=j;
		
	}
	public void pricesoClickB1(int i, int j) {
		if(movimientoB(i,j)==false) {
			return ;
		}
		casilla[x2][yb].setIcon(null);
		casilla[i][j].setIcon(imagenBlanco());
		x2=i;
		yb=j;
		
	}
   
	public JButton[][] getCasilla(){
		return this.casilla;
				
	}
}
