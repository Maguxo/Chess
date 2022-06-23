package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

public class caballo {
	private int x=7,y=1,yn=6;
	private int x2=0,y2=1,yb=6;
	private ImageIcon caballoN= null, caballoB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon caballoN2= new ImageIcon("src/Chess/fichas/caballoN.png");
	private ImageIcon caballoB2= new ImageIcon("src/Chess/fichas/caballoB.png");
  
    public caballo(JButton[][] casilla) {
    	this.casilla= casilla;
    }
	
	public  ImageIcon imagenBlanco() {
		caballoB= new ImageIcon(caballoB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return caballoB;
	}

	public  ImageIcon imagenNegra() {
		caballoN= new ImageIcon(caballoN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return caballoN;
	}

    public boolean movimientoN(int i, int j) {
    	int fila= Math.abs(i - this.x);
    	int columna= Math.abs(j - this.y);
    	
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    public boolean movimientoN1(int i, int j) {
    	int fila= Math.abs(i - this.x);
    	int columna= Math.abs(j - this.yn);
    	
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    public void procesoClickN(int i, int j) {
    	if (movimientoN(i,j)==false) {
    		return;
    	}
    	casilla[x][y].setIcon(null);
    	casilla[i][j].setIcon(imagenNegra());
    	x=i;
    	y=j;
    }
    public void procesoClickN1(int i, int j) {
    	if (movimientoN1(i,j)==false) {
    		return;
    	}
    	casilla[x][yn].setIcon(null);
    	casilla[i][j].setIcon(imagenNegra());
    	x=i;
    	yn=j;
    }
    public boolean movimientoB(int i, int j) {
    	int fila= Math.abs(i - this.x2);
    	int columna= Math.abs(j - this.y2);
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    public boolean movimientoB1(int i, int j) {
    	int fila= Math.abs(i - this.x2);
    	int columna= Math.abs(j - this.yb);
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    public void procesoClickB(int i, int j) {
    	if (movimientoB(i,j)==false) {
    		return;
    	}
    	casilla[x2][y2].setIcon(null);
    	casilla[i][j].setIcon(imagenBlanco());
    	x2=i;
    	y2=j;
    }
    public void procesoClickB1(int i, int j) {
    	if (movimientoB1(i,j)==false) {
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
