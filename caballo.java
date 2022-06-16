package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class caballo {
	private int x=7;
	private int y=1;
	private int x2=0;
	private int y2=1;
	private ImageIcon caballoN= null, caballoB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon caballoN2= new ImageIcon("src/Chess/fichas/caballoN.png");
	private ImageIcon caballoB2= new ImageIcon("src/Chess/fichas/caballoB.png");
  
    
	
	public  ImageIcon imagenBlanco() {
		caballoB= new ImageIcon(caballoB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return caballoB;
	}

	public  ImageIcon imagenNegra() {
		caballoN= new ImageIcon(caballoN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return caballoN;
	}

    public boolean movimiento(int i, int j) {
    	int fila= Math.abs(i - this.x);
    	int columna= Math.abs(j - this.y);
    	
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    
    public void procesoClickN(int i, int j) {
    	if (movimiento(i,j)==false) {
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
    	
    	if((fila==1 && columna== 2) || (fila==2 && columna==1)) {
    		return true;
    	}
    	     return false;
    }
    
    public void procesoClickB(int i, int j) {
    	if (movimiento2(i,j)==false) {
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
