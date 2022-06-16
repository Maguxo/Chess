package Chess;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;

public class Accionar extends Diseño  {
	
	private JButton   casilla[][]= getCasilla();
	boolean jugador= true;
	
   public Accionar() {   
	   moverVentana2();
	   cierreVentana();
	   moverPieza();
	   
   }
	
	public void moverPieza(){   
	  MouseListener llamado= new MouseListener() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		for(int i=0; i< casilla.length; i++) { 
    		      for(int j=0; j< casilla[i].length;j++) {
    		    	   if(e.getSource()== casilla[i][j]) {
    		    		  
    		    			 //getPeon().procesoClickN(i, j);
    		               // getTorre().procesoClickN(i, j);
    		    		   //getCaballo().procesoClickN(i, j);
    		    		   //getAlfil().pricesoClickN(i, j);
    		    			//getRei().procesoClickN(i, j);  
    		    		     //getAlfil().pricesoClickN(i, j);
    		    		  
    		    		   //getPeon().procesoClickB(i, j);
    		    		  // getTorre().procesoClickB(i, j);
    		    		   //getCaballo().procesoClickB(i, j);
    		    		   //getAlfil().pricesoClickB(i, j);
    		    		  // getReina().procesoClickB(i, j);
                             getRei().procesoClickB(i, j);
    		    	   }
    		    	   }
    		    		   }
    	}
      	@Override
    	public void mousePressed(MouseEvent e) {
      	}
      	@Override
    	public void mouseReleased(MouseEvent e) {}
      	@Override
    	public void mouseEntered(MouseEvent e) {}
      	@Override
    	public void mouseExited(MouseEvent e) {}  	
    };
    
    for(int i=0; i< casilla.length; i++) { 
      for(int j=0; j< casilla[i].length;j++) {
    	casilla[i][j].addMouseListener(llamado);
	}
	}
}
	
	 public void moverVentana2() {		
			MouseMotionListener muev= new MouseMotionListener() {
		      @Override
			    public void mouseDragged(MouseEvent e) {
		    	  setLocation(e.getXOnScreen(), e.getYOnScreen());}
				  @Override
				public void mouseMoved(MouseEvent e) {}
			  };
			getPanel().addMouseMotionListener(muev);
		    }
	 
      public void cierreVentana() {
		MouseListener cierre= new MouseListener() {
	      @Override
		    public void mouseClicked(MouseEvent e){
	    	  System.exit(0);
	    	  }
			  @Override
			    public void mousePressed(MouseEvent e){}
			     @Override
			   public void mouseReleased(MouseEvent e){}
			 @Override
		   public void mouseEntered(MouseEvent e){
				 getCierreV().setBackground(new Color(67,168,217));
				  getCierreV().setForeground(Color.white);	}
	     @Override
	   public void mouseExited(MouseEvent e){
	    	 getCierreV().setBackground(Color.black);
	    	 getCierreV().setForeground(new Color(67,168,217));}
	 }; 
    getCierreV().addMouseListener(cierre);
   }
      
}
