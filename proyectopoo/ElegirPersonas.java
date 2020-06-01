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
public class ElegirPersonas extends JFrame {
    public ElegirPersonas() {
        /*
        Variable        Tipo            Uso
        p1              JPanel          Sirve como contenedor de los elementos.
        p2              JPanel          Sirve como contenedor de los elementos.
        bgPersonas       ButtonGroup     Sirve para agrupar a los botones.
        btnCambiar      JButton         Sirve como el boton para confirmar la
                                        accion.
        */
        super("Proyecto 1.0");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel p1 = new JPanel(new GridLayout(0,5));
        JPanel p2 = new JPanel();
        
        ButtonGroup bgPersonas = new ButtonGroup();
                
        for(int i=0; i<ProyectoPOO.personas.length;i++)
        {
            if(ProyectoPOO.personas[i].get_disponible())
                rdbPersonas[i] = new JRadioButton("No existe");
            else
                rdbPersonas[i] = new JRadioButton(ProyectoPOO.personas[i].get_nombre());    
            
            bgPersonas.add(rdbPersonas[i]);
            p1.add(rdbPersonas[i]);
        }
        
        JButton btnCambiar = new JButton("Cambiar");
        
        btnCambiar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed();
            }
        });
        
        p2.add(btnCambiar);
        
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void btnCambiarActionPerformed()
    {
        /*
        Variable        Tipo        Uso
        i               int         Sirve como contador interno para el ciclo
                                    for.
        */
        for(int i=0; i<ProyectoPOO.personas.length;i++)
        {
            if(rdbPersonas[i].isSelected() && !ProyectoPOO.personas[i].get_disponible())
                new CambiarPersonas(ProyectoPOO.personas[i]);
        }
        this.setVisible(false);
    }
    /*
    Variable        Tipo            Uso
    rdbAutores[]    JRadioButton    Son los botones para seleccionar al 
                                    autor.
    */
    private JRadioButton rdbPersonas[] = new JRadioButton[ProyectoPOO.personas.length];
}
