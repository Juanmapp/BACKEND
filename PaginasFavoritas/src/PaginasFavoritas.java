import java.io.*;
import java.util.ArrayList;

public class PaginasFavoritas {

    public static void main(String[] args) {

        Pagina pagina1 = new Pagina("https://github.com/Juanmapp?tab=repositories", "https://github.com/", "Github");
        Pagina pagina2 = new Pagina("https://www.linkedin.com/in/juan-manuel-licini-02167223a/", "https://www.linkedin.com/", "Linkedin");
        Pagina pagina3 = new Pagina("https://www.youtube.com/@midudev" , "https://www.youtube.com/", "Youtube");

        ArrayList<Pagina> paginasFavs = new ArrayList<Pagina>();

        paginasFavs.add(pagina1);
        paginasFavs.add(pagina2);
        paginasFavs.add(pagina3);

        try {
            FileOutputStream file = new FileOutputStream("paginas.dat");
            ObjectOutputStream obj = new ObjectOutputStream(file);

            obj.writeObject(paginasFavs);

            obj.close();

            FileInputStream fil = new FileInputStream("paginas.dat");
            ObjectInputStream objIn = new ObjectInputStream(fil);

            ArrayList<Pagina> paginas;
            paginas = (ArrayList<Pagina>) objIn.readObject();



                for (int i = 0; i < paginas.size(); i++) {
                    System.out.println("Pagina favorita : " +(i+1));
                    System.out.println(paginas.get(i));
                }

            objIn.close();






        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
