package tecsup.ricardobq.lab06.mbrtapp.datos;

public class Usuario {

    private String username;
    private String clave;

    public Usuario(){}

    public Usuario(String usurname, String clave) {
        this.username = usurname;
        this.clave = clave;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usurname) {
        this.username = usurname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return username +clave;
    }
}
