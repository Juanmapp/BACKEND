public class SerieProxy implements ISerie{
    private int cantVistas;

    @Override
    public String getPelicula(String nombre) throws SerieNoHabilitadaException {
        this.cantVistas += 1;
        if(this.cantVistas <= 5){
            System.out.println(cantVistas);
            Serie serie = new Serie();
            return serie.getPelicula(nombre);
        }
        throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas");
    }
}
