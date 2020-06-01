/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author aless
 */
public class Personas {
      /*
    OBJETO AUTOR
    Variable      Tipo         Uso
    nombre        String       Almacena el nombre de la persona.
    email         String       Almacena el correo de la persona.
    celular       String       Almacena el celular de la persona. 
    comentarios   String       Almacena otros datos relevantes de ser necesario.
    disponible    boolean      Almacena un valor que indica si espacio esta disponible
                             para llenar o no.
    */
    private String nombre = "";
    private String email = "";
    private String celular = "";
    private String comentarios = "";
    private boolean disponible = true;
    
    public void put_nombre(String in_nombre)
    {
        this.nombre = in_nombre;
    }
    
    public void put_email(String in_email)
    {
        this.email = in_email;
    }
    
    public void put_celular(String in_celular)
    {
        this.celular = in_celular;
    }
    
    public void put_comentarios(String in_comentarios)
    {
        this.comentarios = in_comentarios;
    }
    
    public void put_disponible(boolean in_disponible)
    {
        this.disponible = in_disponible;
    }
    
    public String get_nombre()
    {
        return this.nombre;
    }
    
    public String get_email()
    {
        return this.email;
    }
    
    public String get_celular()
    {
        return this.celular;
    }
    
    public String get_comentarios()
    {
        return this.comentarios;
    }
    
    public boolean get_disponible()
    {
        return this.disponible;
    }
}
