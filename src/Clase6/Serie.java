public class Serie implements ISerie{

    @Override
    public String getPelicula(String nombre) {
        System.out.println("www." + nombre);
        return "www." + nombre;
    }
}
