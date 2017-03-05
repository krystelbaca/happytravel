package app.krystelbaca.com.happytravel.dummy;

/**
 * Created by krystelbaca on 3/5/17.
 */

public class Destino {

    private String nombre_destino;
    private String descripcion_destino;
    private String id_destino;


    public Destino(String nombre_destino, String descripcion_destino, String id_destino) {
        this.nombre_destino = nombre_destino;
        this.descripcion_destino = descripcion_destino;
        this.id_destino = id_destino;
    }

    public String getNombre_destino() {
        return nombre_destino;
    }

    public void setNombre_destino(String nombre_destino) {
        this.nombre_destino = nombre_destino;
    }

    public String getDescripcion_destino() {
        return descripcion_destino;
    }

    public void setDescripcion_destino(String descripcion_destino) {
        this.descripcion_destino = descripcion_destino;
    }

    public String getId_destino() {
        return id_destino;
    }

    public void setId_destino(String id_destino) {
        this.id_destino = id_destino;
    }
}
