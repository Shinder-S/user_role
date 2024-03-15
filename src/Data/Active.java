package Data;

public class Active {
    private String nombre;
    private String descripcion;
    private String numeroSerie;
    private String ubicacion;
    private String estado;
    private String propietario;
    private String fechaAdquisicion;

    // Constructor
    public Active(String nombre, String descripcion, String numeroSerie, String ubicacion, String estado, String propietario, String fechaAdquisicion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroSerie = numeroSerie;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.propietario = propietario;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    // Getters y Setters

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

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
}
