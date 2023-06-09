import java.io.*;
import java.util.ArrayList;

public class Paseo {

    public static void main(String[] args)  {
        Perro p1 = new Perro("Sakura", "salchibull", 3, "Camarones 2530");
        Perro p2 = new Perro("Gaia" , "pitbull", 6, "Chivilcoy 1117");
        Perro p3 = new Perro("Coby", "coker", 12, "Florencio varela 160");
        Perro p4 = new Perro("Negri", "perro", 8, "Bahia blanca 1321");

        ArrayList<Perro> lunes = new ArrayList<Perro>();
        ArrayList<Perro> martes = new ArrayList<Perro>();
        ArrayList<Perro> miercoles = new ArrayList<Perro>();
        ArrayList<Perro> jueves = new ArrayList<Perro>();
        ArrayList<Perro> viernes = new ArrayList<Perro>();


        lunes.add(p1);
        miercoles.add(p1);
        viernes.add(p1);

        lunes.add(p2);
        martes.add(p2);
        miercoles.add(p2);
        jueves.add(p2);

        miercoles.add(p3);
        jueves.add(p3);
        viernes.add(p3);

        lunes.add(p4);
        martes.add(p4);
        miercoles.add(p4);
        jueves.add(p4);
        viernes.add(p4);

        try {
            FileOutputStream fil = new FileOutputStream("perros.dat");
            ObjectOutputStream archi = new ObjectOutputStream(fil);

            archi.writeObject(lunes);
            archi.writeObject(martes);
            archi.writeObject(miercoles);
            archi.writeObject(jueves);
            archi.writeObject(viernes);


            archi.close();

            fil.close();

            FileInputStream filIn = new FileInputStream("perros.dat");
            ObjectInputStream archiIn = new ObjectInputStream(filIn);



            ArrayList <Perro> dia;

            for (int i = 0; i < 5; i++) {
                System.out.println("Dia: " + (i+1));
                System.out.println("=======");
                dia = (ArrayList<Perro>) archiIn.readObject();
                for ( Perro p: dia
                     ) {
                }
            }

            archiIn.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }




}
