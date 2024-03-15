package Data;
import java.util.ArrayList;


public class Perfil {
    private String nombre;
    private String descripcion;
    private ArrayList<Rol> roles;


    // Constructor
    public Perfil(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.roles = new ArrayList<>();
    }

    // Método para añadir un rol al perfil
    public void agregarRol(Rol rol) {
        roles.add(rol);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}


