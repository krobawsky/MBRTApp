package tecsup.ricardobq.lab06.mbrtapp.datos;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private String validar;
    private String user, pass;

    public void setValidar(String validar) {
        this.validar = validar;
    }

    public String getValidar() {
        return validar;
    }

    private static UsuarioRepository Usuario = null;

    public static UsuarioRepository crearPersona() {
        if (Usuario == null) { Usuario = new UsuarioRepository(); }
        return Usuario;
    }

    public String datos(Usuario usuario){

        String[] usernamesCliente = {"cliente@mbrt"};
        String[] passwordsCliente = {"cliente"};
        String[] usernamesSupervisor = {"supervisor@mbrt"};
        String[] passwordsSupervisor = {"supervisor"};
        String[] usernamesTecnico = {"tecnico@mbrt"};
        String[] passwordsTecnico = {"tecnico"};

        user = usuario.getUsername();
        pass = usuario.getClave();

        for(int i=0;i<=0;i++){

            if(usernamesCliente[i].equalsIgnoreCase(user) && passwordsCliente[i].equals(pass)){
                setValidar("1");
                break;
            }else if (usernamesSupervisor[i].equalsIgnoreCase(user) && passwordsSupervisor[i].equals(pass)){
                setValidar("2");
                break;
            }else if (usernamesTecnico[i].equalsIgnoreCase(user) && passwordsTecnico[i].equals(pass)){
                setValidar("3");
                break;
            }
            else{
                setValidar("no");
            }
        }
        return getValidar();
    }

}
