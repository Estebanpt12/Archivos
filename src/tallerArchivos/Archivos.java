package tallerArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) {

        File carpeta = new File("Resources");
        File archivo = new File("Resources/Archivo.txt");
        Archivos archivos = new Archivos();

        archivos.crearCarpeta(carpeta);
        try{
            archivos.crearArchivo(archivo);
            archivos.escribirEnArchivo(archivo, "Hello World");
        }catch (IOException e){
            System.out.println("Error en el archivo");
        }
    }

    public void crearArchivo(File archivo) throws IOException {
        if(!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo creado");
        }
    }

    public  void crearCarpeta(File carpeta){
        if(carpeta.mkdir()){
            System.out.println("Carpeta creada");
        }
    }

    public void escribirEnArchivo(File archivo, String contenido) throws IOException{
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
    }
}
