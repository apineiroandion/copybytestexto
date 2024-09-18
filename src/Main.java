import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/home/dam/Desktop/copybytestextos/copybytestextos.txt");
        }catch (FileNotFoundException e){
            System.out.println("Error al abrir el archivo");
        }
    }
}