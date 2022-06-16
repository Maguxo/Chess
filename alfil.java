package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class alfil {
	
	private int x=7;
	private int y=2;
	private int x2=0;
	private int y2=2;
	private ImageIcon alfilN= null, alfilB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon alfilN2= new ImageIcon("src/Chess/fichas/alfilN.png");
	private ImageIcon alfilB2= new ImageIcon("src/Chess/fichas/alfilB.png");
  
    
	
	public  ImageIcon imagenBlanco() {
		alfilB= new ImageIcon(alfilB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return alfilB;
	}

	public  ImageIcon imagenNegra() {
		alfilN= new ImageIcon(alfilN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return alfilN;
	}
	
	public boolean movimiento(int i, int j) {
		int fila= Math.abs(i - this.x);
		int columna= Math.abs(j - this.y);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	
	public void pricesoClickN(int i, int j) {
		if(movimiento(i,j)==false) {
			return ;
		}
		casilla[x][y].setIcon(null);
		casilla[i][j].setIcon(imagenNegra());
		x=i;
		y=j;
		
	}
   
	public boolean movimiento2(int i, int j) {
		int fila= Math.abs(i - this.x2);
		int columna= Math.abs(j - this.y2);
		if(fila==1 && columna==1) {
			return true;
		}
		return false;
	}
	
	public void pricesoClickB(int i, int j) {
		if(movimiento2(i,j)==false) {
			return ;
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
