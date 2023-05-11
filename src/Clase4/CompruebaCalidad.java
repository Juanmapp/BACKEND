package Clase4;

public class CompruebaCalidad {

    AnalistaDeCalidad inicial;

public CompruebaCalidad() {
    this.inicial = new Lote();
    AnalistaDeCalidad peso = new Peso();
    AnalistaDeCalidad envase = new Envase();

    inicial.setSigControl(peso);
    peso.setSigControl(envase);
}
public void comprobarCalidad(Articulo articulo) {
inicial.validarCalidadDelProducto(articulo);
}
}
