package Chess;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

 public   class peon  { 
	private int x=6,y=0, yn1=1, yn2=2,yn3=3, yn4=4,yn5=5,yn6=6,yn7=7;
	private int x2=1,y2=0, yb1=1, yb2=2,yb3=3, yb4=4,yb5=5,yb6=6,yb7=7;;
	private ImageIcon peonN= null, peonB= null; 
    private JButton casilla[][]=new JButton[8][8];
    private ImageIcon peonN2= new ImageIcon("src/Chess/fichas/peonN.png");
	private ImageIcon peonB2= new ImageIcon("src/Chess/fichas/peonB.png");
	
	public peon(JButton[][] casilla) {
		 this.casilla= casilla;
		 
	 }
    public ImageIcon imagenBlanco() {
		peonB= new ImageIcon(peonB2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return peonB;
	}
    
    public  ImageIcon imagenNegra() {
		peonN= new ImageIcon(peonN2.getImage().getScaledInstance(36, 50, Image.SCALE_SMOOTH));
		return peonN;
	}
	
	public boolean movimientoN(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.y);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN1(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn1);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN2(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn2);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN3(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn3);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN4(int i, int j) {
  		int filaDelta= Math.abs(i-this.x);
  		int columnaDelta= Math.abs(j-this.yn4);
  		
  		if((filaDelta==1)&&(columnaDelta==0)) {
  		  return true;
  		}
  		    return false;
        }
  	
	public boolean movimientoN5(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn5);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN6(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn6);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	
	public boolean movimientoN7(int i, int j) {
		int filaDelta= Math.abs(i-this.x);
		int columnaDelta= Math.abs(j-this.yn7);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }
	public void procesoClickN(int i, int j ) {
		if(movimientoN(i,j)== false) {	
			return  ;
		}
	     casilla[x][y].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     y= j;
	     
	}
	public void procesoClickN1(int i, int j ) {
		if(movimientoN1(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn1].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn1= j;     
	}
	public void procesoClickN2(int i, int j ) {
		if(movimientoN2(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn2].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn2= j;     
	}
	public void procesoClickN3(int i, int j ) {
		if(movimientoN3(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn3].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn3= j;     
	}
	public void procesoClickN4(int i, int j ) {
		if(movimientoN4(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn4].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn4= j;     
	}
	public void procesoClickN5(int i, int j ) {
		if(movimientoN5(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn5].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn5= j;     
	}
	public void procesoClickN6(int i, int j ) {
		if(movimientoN6(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn6].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn6= j;     
	}
	public void procesoClickN7(int i, int j ) {
		if(movimientoN7(i,j)== false) {	
			return  ;
		}
	     casilla[x][yn7].setIcon(null);
	     casilla[i][j].setIcon(imagenNegra());
	     x= i; 
	     yn7= j;     
	}
	//---------------------------
	public boolean movimientoB(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.y2);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB1(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb1);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB2(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb2);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB3(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb3);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB4(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb4);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB5(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb5);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB6(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb6);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
		  return true;
		}
		    return false;
      }	
	public boolean movimientoB7(int i, int j) {
		int filaDelta= Math.abs(i-this.x2);
		int columnaDelta= Math.abs(j-this.yb7);
		
		if((filaDelta==1)&&(columnaDelta==0)) {
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
	     x2= i; 
	     y2= j;
	}
	public void procesoClickB1(int i, int j) {
		if(movimientoB1(i,j)==false) {
			return;
		}
		 casilla[x2][yb1].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb1= j;
	}
	public void procesoClickB2(int i, int j) {
		if(movimientoB2(i,j)==false) {
			return;
		}
		 casilla[x2][yb2].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb2= j;
	}
	public void procesoClickB3(int i, int j) {
		if(movimientoB3(i,j)==false) {
			return;
		}
		 casilla[x2][yb3].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb3= j;
	}
	public void procesoClickB4(int i, int j) {
		if(movimientoB(i,j)==false) {
			return;
		}
		 casilla[x2][yb4].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb4= j;
	}
	public void procesoClickB5(int i, int j) {
		if(movimientoB5(i,j)==false) {
			return;
		}
		 casilla[x2][yb5].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb5= j;
	}
	public void procesoClickB6(int i, int j) {
		if(movimientoB6(i,j)==false) {
			return;
		}
		 casilla[x2][yb6].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb6= j;
	}
	public void procesoClickB7(int i, int j) {
		if(movimientoB7(i,j)==false) {
			return;
		}
		 casilla[x2][yb7].setIcon(null);
	     casilla[i][j].setIcon(imagenBlanco());
	     x2= i; 
	     yb7= j;
	}
	public JButton[][] getCasilla() {
		return this.casilla;
	}
	
 }


