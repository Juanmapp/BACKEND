package Clase4;

public abstract class AnalistaDeCalidad{

    protected AnalistaDeCalidad sigControl;

    public AnalistaDeCalidad getSigControl() {
        return this.sigControl;
    }

    public void setSigControl(AnalistaDeCalidad sig) {
        this.sigControl = sig;
    }

    public abstract void validarCalidadDelProducto(Articulo articulo);
    }

