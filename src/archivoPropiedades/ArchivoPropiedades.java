package archivoPropiedades;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ArchivoPropiedades {

    public static void main(String[] args) {
        String ruta = "Resources/Properties.properties";
        File archivo = new File(ruta);
        ArchivoPropiedades archivos = new ArchivoPropiedades();
        try{
            archivos.crearArchivoProperties(archivo);
            archivos.aniadirPropertie("File", "New", ruta);
        }catch (IOException e){
            System.out.println("Error en el archivo");
        }
    }

    public void aniadirPropertie(String key, String value, String ruta) throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader(ruta));
        properties.setProperty(key, value);
        properties.store(new FileWriter(ruta), "");
        System.out.println("Propertie creada");
    }

    public void crearArchivoProperties(File archivo) throws IOException {
        if(!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo creado");
        }
    }
}
