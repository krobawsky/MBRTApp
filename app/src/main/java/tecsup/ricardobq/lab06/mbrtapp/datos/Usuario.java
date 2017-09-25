package tecsup.ricardobq.lab06.mbrtapp.datos;

public class Usuario {

    String username;
    String password;
    String nombre;
    String rol;


    public Usuario(String username, String password, String nombre, String rol) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.rol = rol;
    }

    public Usuario(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
