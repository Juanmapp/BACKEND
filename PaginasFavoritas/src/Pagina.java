import java.io.Serializable;

public class Pagina implements Serializable {
    private String url;
    private String direccionWeb;
    private String nombre;

    @Override
    public String toString() {
        return "Pagina{" +
                "url='" + url + '\'' +
                ", direccionWeb='" + direccionWeb + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Pagina(String url, String direccionWeb, String nombre) {
        this.url = url;
        this.direccionWeb = direccionWeb;
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
