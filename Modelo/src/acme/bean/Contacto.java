package acme.bean;

public class Contacto {
    public Contacto() {
        super();
    }
    
    private String nombre;
    private String email;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Contacto (String nombre, String email){
        this.nombre=nombre;
        this.email=email;
    }
}
