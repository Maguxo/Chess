package Chess;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

 public   class peon  {
	
	private int x=6;
	private int y=0;
	private int x2=1;
	private int y2=0;
	private ImageIcon peonN= null, peonB= null; 
    private JButton casilla[][]=new JButton[8][8];
    private ImageIcon peonN2= new ImageIcon("src/Chess/fichas/peonN.png");
	private ImageIcon peonB2= new ImageIcon("src/Chess/fichas/peonB.png");
	
    public ImageIcon imagenBlanco() {
		peonB= new ImageIcon(peonB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return peonB;
	}
    
    public  ImageIcon imagenNegra() {
		peonN= new ImageIcon(peonN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return peonN;
	}
	
	
	public boolean movimiento(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.y);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public void procesoClickN(int i, int j ) {
		if(movimiento(i,j)== false) {	
			return  ;
		}
	     casilla[x][y].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     y= j;
	}
	
	public boolean movimiento2(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.y2);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
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
	     x2= i; 
	     y2= j;
	}
	
	public JButton[][] getCasilla() {
		return this.casilla;
	}
	
	
 }


