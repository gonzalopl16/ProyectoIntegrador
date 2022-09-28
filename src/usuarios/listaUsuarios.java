/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;
import java.util.*;

/**
 *
 * @author Luis Gonzalo <https://github.com/gonzalopl16>
 */
public class listaUsuarios {

    private List<Usuario> list = new ArrayList<>();

    public listaUsuarios() {
        list.add(new UsuarioDemo("Luis", "12345"));
        list.add(new UsuarioPremium("Gonzalo", "12345"));
    }

    public UsuarioDemo buscarUD(String id){
        for(Usuario x: list){
            if (x instanceof UsuarioDemo) {
                if(x.getId().equals(id))
                    return (UsuarioDemo)x;
            }
        }
        return null;
    }
    
    public UsuarioPremium buscarUP(String id){
        for(Usuario x: list){
            if (x instanceof UsuarioPremium) {
                if(x.getId().equals(id))
                    return (UsuarioPremium)x;
            }
        }
        return null;
    }

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }

}
