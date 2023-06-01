import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {

        Contacto contacto1 = new Contacto("Sergio", "sergio@gmail.com", "121324543");
        Contacto contacto2 = new Contacto("Juan", "juanma@gmail.com", "12354436");
        Contacto contacto3 = new Contacto("Diego", "dieee@gmail.com", "213436");


        ArrayList<Contacto> contactos = new ArrayList<Contacto>();

        contactos.add(contacto1);
        contactos.add(contacto2);
        contactos.add(contacto3);

        FileOutputStream fiOut = null;
        ObjectOutputStream objOut = null;
        FileInputStream fiIn = null;
        ObjectInputStream objIn = null;

        try {
            fiOut = new FileOutputStream("contactos.txt");
            objOut = new ObjectOutputStream(fiOut);
            objOut.writeObject(contactos);

            objOut.close();

            fiIn = new FileInputStream("contactos.txt|");
            objIn = new ObjectInputStream(fiIn);
            ArrayList<Contacto> listaDeContactos;

            listaDeContactos = (ArrayList<Contacto>) objIn.readObject();

            for (int i = 0; i < listaDeContactos.size(); i++) {
                System.out.println("Contacto :" + (i+1));
                System.out.println(listaDeContactos.get(i));
            }
            System.out.println("=============");
            for (Contacto contacto: listaDeContactos
                 ) {
                System.out.println(contacto);
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
