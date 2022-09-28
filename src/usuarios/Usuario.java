/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class Usuario {
    private String nombre;
    private String id;
    private String contraseña;

    public Usuario(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
