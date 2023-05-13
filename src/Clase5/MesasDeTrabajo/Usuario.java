public class Usuario {

    private String identificador;
    private String tipoUsuario;


    public Usuario(String identificador, String tipoUsuario) {
        this.identificador = identificador;
        this.tipoUsuario = tipoUsuario;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

