package Chess;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//realizado por: Magucho 
//proyecto: Chess

public class Accionar2 extends Accionar{
 
	private JButton[][] casilla= getCasillas();
	private boolean turno= true;
	
	public Accionar2() {
		moverFichas();    
	}
	
	public void moverFichas() {
		ActionListener llamado= new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<casilla.length; i++) {
					for(int j=0; j<casilla[i].length; j++) {
						if(e.getSource()== casilla[i][j]) {
						if(turno) {
							getTorre().procesoClickB(i, j);
							getTorre().procesoClickB1(i, j);
							getCaballo().procesoClickB(i, j);
							getCaballo().procesoClickB1(i, j);
							getAlfil().pricesoClickB(i, j);
							getAlfil().pricesoClickB1(i, j);
							getReina().procesoClickB(i, j);
							getRei().procesoClickB(i, j);
							
							turno=false;
						}else {
							getTorre().procesoClickN(i, j);
							getTorre().procesoClickN1(i, j);
							getCaballo().procesoClickN(i, j);
							getCaballo().procesoClickN1(i, j);
							getAlfil().pricesoClickN(i, j);
							getAlfil().pricesoClickN1(i, j);
						
							turno=true;
						
						}
						if(turno) {
							getPeon().procesoClickB(i, j);
							getPeon().procesoClickB1(i, j);
							getPeon().procesoClickB2(i, j);
							getPeon().procesoClickB3(i, j);
							getPeon().procesoClickB4(i, j);
							getPeon().procesoClickB5(i, j);
							getPeon().procesoClickB6(i, j);
							getPeon().procesoClickB7(i, j);
							
						}else {
							getPeon().procesoClickN(i, j);
							getPeon().procesoClickN1(i, j);
							getPeon().procesoClickN2(i, j);
							getPeon().procesoClickN3(i, j);
							getPeon().procesoClickN4(i, j);
							getPeon().procesoClickN5(i, j);
							getPeon().procesoClickN6(i, j);
							getPeon().procesoClickN7(i, j);
							}		
						}
					}
				}
			}
		};
		for(int i=0; i<casilla.length; i++ ) {
			for(int j=0; j<casilla[i].length; j++) {
				casilla[i][j].addActionListener(llamado);
			}
		}	
	}
}
