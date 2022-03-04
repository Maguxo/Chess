package Chess;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Accionar extends Diseño{
	
	public Accionar() {
		
		cierreVentana();
		moverVentana2();
	}
	
	public void moverVentana2() {
		
		MouseMotionListener muev= new MouseMotionListener() {
	      @Override
		    public void mouseDragged(MouseEvent e) {setLocation(e.getXOnScreen(), e.getYOnScreen());}
			  @Override
			public void mouseMoved(MouseEvent e) {}
		  };
		getPanel().addMouseMotionListener(muev);
	    }
    
	
	public void cierreVentana() {
		
		MouseListener cierre= new MouseListener() {
	      @Override
		    public void mouseClicked(MouseEvent e){System.exit(0);}
			  @Override
			    public void mousePressed(MouseEvent e){}
			     @Override
			   public void mouseReleased(MouseEvent e){}
			 @Override
		   public void mouseEntered(MouseEvent e){getCierrev().setBackground(new Color(67,168,217));getCierrev().setForeground(Color.white);	}
	     @Override
	   public void mouseExited(MouseEvent e){getCierrev().setBackground(Color.black);getCierrev().setForeground(new Color(67,168,217));}
	 }; 
   getCierrev().addMouseListener(cierre);
   }
	
}
