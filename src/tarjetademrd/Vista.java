/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetademrd;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Vista extends JFrame{
    
    
    
    JLabel codigo=new JLabel("Codigo: ");
    JLabel nombre=new JLabel("Nombre: ");  
    JLabel saldo=new JLabel("Saldo: "); 
    JTextField loqueHay=new JTextField(); 
    JTextField code=new JTextField(); 
    JTextField name=new JTextField(); 
    JButton registrarse= new JButton(); 
    JButton pagar= new JButton();  
    JButton Recargar= new JButton(); 
    JButton consultarr= new JButton("Consultar"); 
    
    void mostrar(){ 
        setSize(500,500);
        setLocationRelativeTo(null);//centra ventana 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    Vista(){ 
        
        
        Container c=getContentPane();   
        c.setLayout(null); 
        
        c.add(codigo); 
        c.add(code); 
        codigo.setBounds(0,20,120,30); 
        code.setBounds(60,20,120,20); 
        
        c.add(nombre); 
        c.add(name); 
        nombre.setBounds(200,20,120,30); 
        name.setBounds(250,20,120,20); 
        
        c.add(saldo); 
        c.add(loqueHay); 
        saldo.setBounds(0,60,50,30); 
        loqueHay.setBounds(60,60,120,20); 
       
        c.add(consultarr); 
         
        consultarr.setBounds(200,90,120,30); 
        
         c.add(consultarr); 
         
        consultarr.setBounds(200,90,120,30);  
        
        c.add(consultarr); 
         
        consultarr.setBounds(200,90,120,30); 
        
        } 
   
    
    
    public void escribeSaldo( String s){
        loqueHay.set
    }  
    public double getloqueHay(){
        try{
            return Double.parseDouble(loqueHay.getText());
        }
        catch(NumberFormatException e){
            return 0.0;
        }
        
    }
    
    public void  setControlConsulta(Controlador c){
        
        consultarr.addActionListener(c);
        
    }
    static final String CONS=" colsultaaar";
}  

