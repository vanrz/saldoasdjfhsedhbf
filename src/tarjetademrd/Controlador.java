/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetademrd;

/**
 *
 * @author usuario
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class Controlador implements ActionListener{
    
    private Vista miVista;
    private Modelo miModelo;
            
    public Controlador( Vista miVista, Modelo miModelo){
        this.miVista= miVista;
        this.miModelo=miModelo;
        
    }        
            
            
    @Override
    public void actionPerformed(ActionEvent evento) {
        double loqueHay= miVista.getloqueHay();
        
        if(evento.getActionCommand().equals(Vista.CONS)){
            miVista.escribeSaldo(miModelo.saldo(loqueHay));
           
        }
        else 
            miVista.escribeSaldo("ooops");
            
        
            
    }
    
}
