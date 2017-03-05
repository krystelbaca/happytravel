package app.krystelbaca.com.happytravel.dummy;

/**
 * Created by krystelbaca on 3/5/17.
 */

public class Oferta {

    private String nombre;
    private String descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Oferta(String nombre, String descripcion, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

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
