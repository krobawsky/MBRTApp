package tecsup.ricardobq.lab06.mbrtapp.datos;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private static UsuarioRepository _INSTANCE = null;

    private UsuarioRepository(){}

    public static UsuarioRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new UsuarioRepository();
        return _INSTANCE;
    }

    List<Usuario> usuarios = new ArrayList<Usuario>();

    public void list(){
        usuarios.add(new Usuario("usuario1","pass1","Ricardo1","Cliente"));
        usuarios.add(new Usuario("usuario2","pass2","Ricardo2","Cliente"));
        usuarios.add(new Usuario("usuario3","pass3","Ricardo3","Supervisor"));
        usuarios.add(new Usuario("usuario4","pass4","Ricardo4","Técnico"));
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

}
