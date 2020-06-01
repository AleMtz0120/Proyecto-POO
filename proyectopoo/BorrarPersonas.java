/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author aless
 */
public class BorrarPersonas extends JFrame {
    public BorrarPersonas() {
        /*
        Variable        Tipo            Uso
        btnBorrar       JButton         Es el botón que termina la función una 
                                        vez seleccionados las personas.
        btnRegresar     JButton         Botón que cancela la acción y devuelve el 
                                        menú principal. 
        p1              JPanel          Es uno de los contenedores de los elementos.
        p2              JPanel          Es uno de los contenedores de los elementos.
        i               int             Conocer la posición de la editorial seleccionada. 
        cbPersonas      JCheckBox       Opción que permite colocar un listado de las 
                                        que se puede seleccionar por medio de cajas.
        */
        super("Proyecto 1.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel(new GridLayout(0,2));
        JPanel p2 = new JPanel();
       
        JButton btnBorrar = new JButton("Borrar");
        JButton btnRegresar = new JButton("Regresar");
        
        for(int i=0;i<ProyectoPOO.personas.length;i++)
        {
            if(ProyectoPOO.personas[i].get_disponible())
                cbPersonas[i] = new JCheckBox("No existe");
            else
                cbPersonas[i] = new JCheckBox(ProyectoPOO.personas[i].get_nombre());    
            
            p1.add(cbPersonas[i]);
        } 
        
        btnBorrar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        
        btnRegresar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
                
        p2.add(btnRegresar);
        p2.add(btnBorrar);
        
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt)
    {
        for(int i=0;i<ProyectoPOO.personas.length;i++)
        {
            if(cbPersonas[i].isSelected())
            {
                ProyectoPOO.personas[i].put_nombre("");
                ProyectoPOO.personas[i].put_email("");
                ProyectoPOO.personas[i].put_nombre("");
                ProyectoPOO.personas[i].put_comentarios("");
                ProyectoPOO.personas[i].put_disponible(true);
            }
        }
        
        new ProyectoPOO();
        this.setVisible(false);
    }
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt)
    {        
        new ProyectoPOO();
        this.setVisible(false);
    }
    
    private JCheckBox cbPersonas[] = new JCheckBox[ProyectoPOO.personas.length];
}
