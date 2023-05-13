package Clase5;

import java.util.ArrayList;
import java.util.List;

public class Documento implements Idocumento {

    private int id;
    private String url;
    private String contenido;
    private List<String> listaUsuariosAutorizados;

    public Documento(List<String> listaUsiariosAutorizados) {
        this.listaUsuariosAutorizados = listaUsiariosAutorizados;
    }


    @Override
    public void abrirDocumento(String url, String mail) {
        System.out.println("Revisando permisos de acceso a " + url);
    }
}
