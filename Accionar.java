package Chess;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Color;

//realizado por: Magucho 
//proyecto: Chess

@SuppressWarnings("serial")
public class Accionar extends Diseño  {
	
	private JButton casilla[][]= getCasilla();
     
   public Accionar() {   
	   moverVentana2();
	   cierreVentana();
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
      
   public JButton[][] getCasillas() {
    	  return this.casilla;
      }
}
