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
public class CambiarPersonas extends JFrame {
    public CambiarPersonas(Personas in_personas) {
        /*
        Variable        Tipo        Uso
        p1              JPanel      Sirve como contenedor de los elementos.
        p2              JPanel      Sirve como contenedor de los elementos.
        lbNombre        JLabel      Sirve para identificar cada uno de los
                                    campos de Texto.
        txtNombre       JTextField  Sirve como el campo donde se introduce el
                                    nuevo nombre.
        btnAceptar      JButton     Sirve como el boton que confirma que la
                                    accion esta lista para realizarse.
        */
        super("Proyecto 1.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel(new GridLayout(0,2));
        JPanel p2 = new JPanel();
        
        JLabel lbNombre = new JLabel("Nombre");               
        JTextField txtNombre = new JTextField(in_personas.get_nombre());
        JLabel lbEmail = new JLabel("Email");
        JTextField txtEmail = new JTextField(in_personas.get_email());
        JLabel lbCelular = new JLabel("Celular");               
        JTextField txtCelular = new JTextField(in_personas.get_celular());
        JLabel lbComentarios = new JLabel("Comentarios");
        JTextField txtComentarios = new JTextField(in_personas.get_comentarios());
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(in_personas, txtNombre.getText(), txtEmail.getText(), txtCelular.getText(), txtComentarios.getText());
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
        p2.add(btnAceptar);
        
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void btnAceptarActionPerformed(Personas in_personas, String in_nombre, String in_email, String in_celular, String in_comentarios)
    {
        /*
        Variable        Tipo        Uso
        in_autor        Autor       Es el autor al que se le desea cambiar el
                                    nombre.
        in_nombre       String      Es el nuevo nombre que se le desea dar al
                                    objeto in_autor.
        */
        in_personas.put_nombre(in_nombre);
        in_personas.put_email(in_email);
        in_personas.put_celular(in_celular);
        in_personas.put_comentarios(in_comentarios);
        new ProyectoPOO();
        this.setVisible(false);
    }    
}
