/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 *
 * @author aless
 */
public class AgregarPersonas extends JFrame {
    public AgregarPersonas(){
        /*
        Variable        Tipo        Uso
        btnAgregar      JButton     Es el boton para terminar la funcion y 
                                    agregar lo que este en txtNombre.
        lbNombre        JLabel      Es la etiqueta que describe como se
                                    interpretara lo que este en txtNombre.
        txtNombre       JTextField  Es el campo donde se debe introducir el
                                    nombre de la Editorial.
        p1              JPanel      Es uno de los contenedores de los elementos.
        p2              JPanel      Es uno de los contenedores de los elementos.
        */
        
        super("Proyecto 1.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel(new GridLayout(0, 2));
        JPanel p2 = new JPanel();
        
        JButton btnAgregar = new JButton("Agregar");
        JButton btnRegresar = new JButton("Regresar");
        
        JLabel lbNombre = new JLabel("Nombre");
        JTextField txtNombre = new JTextField("");
        JLabel lbEmail = new JLabel("Email");
        JTextField txtEmail = new JTextField("");
        JLabel lbCelular = new JLabel("Celular");
        JTextField txtCelular = new JTextField("");
        JLabel lbComentarios = new JLabel("Comentarios");
        JTextField txtComentarios = new JTextField("");
        
        btnAgregar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(txtNombre.getText(), txtEmail.getText(), txtCelular.getText(), txtComentarios.getText());
            }
        });
        
        btnRegresar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed();
            }
        });
        
        p1.add(lbNombre);
        p1.add(txtNombre);
        p1.add(lbEmail);
        p1.add(txtEmail);
        p1.add(lbCelular);
        p1.add(txtCelular);
        p1.add(lbComentarios);
        p1.add(txtComentarios);
        p2.add(btnRegresar);
        p2.add(btnAgregar);
                
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void btnAgregarActionPerformed(String in_nombre, String in_email, String in_celular, String in_comentarios)
    {
        /*
        Variable        Tipo        Uso
        nombre          String      Nombre que se recibe del campo de texto en
                                    AgregarPersonas().
        i               int         Saber en que posicion del arreglo 
                                    ProyectoPOO.personas[] va dentro del ciclo.
        confirmar       boolean     Saber si ya se asigno el nombre o no.
        */
        try
        {
            int i=0;
            boolean confirmar = false;
            
            while(!confirmar)
            {   
                if(ProyectoPOO.personas[i].get_disponible())
                {                            
                    ProyectoPOO.personas[i].put_nombre(in_nombre);
                    ProyectoPOO.personas[i].put_email(in_email);
                    ProyectoPOO.personas[i].put_nombre(in_celular);
                    ProyectoPOO.personas[i].put_comentarios(in_comentarios);
                    ProyectoPOO.personas[i].put_disponible(false);
                    confirmar = true;
                }
                else
                    i++;
                
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(this, "Todos los espacios estan "+
                    "llenos.\nSi desea agregar otro autor debe de borrar algun"
                    + "o.");
        }
        
        new ProyectoPOO();
        this.setVisible(false);
    }
    
    private void btnRegresarActionPerformed()
    {
        new ProyectoPOO();
        this.setVisible(false);
    }
}
