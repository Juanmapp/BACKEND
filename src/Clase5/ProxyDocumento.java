package Clase5;

import java.util.List;

public class ProxyDocumento implements Idocumento{

    private Documento documento;

    private List<String> listaUsuariosAutorizados;



    @Override
    public void abrirDocumento(String url, String mail) {

    }
}
