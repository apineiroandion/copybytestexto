import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream("/home/dam/Desktop/copybytestextos/copybytestexto.txt");
            //al añadir true al constructor completamos el apartado dos del ejercicio, añadiendo al final del archivo
            //el contenido sin sobreescribirlo
            fos = new FileOutputStream("/home/dam/Desktop/copybytestextos/copybytestexto2.txt",true);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}