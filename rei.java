package Chess;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

public class rei {
    private int x= 7,y=4;
    private int x2=0,y2=4;
	private ImageIcon reiN= null, reiB= null; 
    private JButton casilla[][]= new JButton[8][8];
    private ImageIcon reiN2= new ImageIcon("src/Chess/fichas/reyN.png");
	private ImageIcon reiB2= new ImageIcon("src/Chess/fichas/reyB.png");
  
	public rei(JButton [][] casilla) {
		this.casilla= casilla;
	}
    
	public  ImageIcon imagenBlanco() {
		reiB= new ImageIcon(reiB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return reiB;
	}

	public  ImageIcon imagenNegra() {
		reiN= new ImageIcon(reiN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
      
		return reiN;
	}
	
    public boolean movimiento(int i, int j) {
    	int fila= Math.abs(i - this.x);
    	int columna= Math.abs(j - this.y);
    	
    	if((fila==1 && columna==1) || (fila==1 && columna==0) || (fila==0 && columna== 1)){
    		return true;
    	}
    	return false; 
    } 
    
    public void procesoClickN(int i, int j) {
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
    	
    	if((fila==1 && columna==1) || (fila==1 && columna==0) || (fila==0 && columna== 1)){
    		return true;
    	}
    	return false; 
    } 
    
    public void procesoClickB(int i, int j) {
    
    	if(movimiento2(i,j)==false) {
    		return ;
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
