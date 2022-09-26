package mostrarVentana;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostrarVentana {
    public static void main(String[] args) {
        MostrarVentana mostrarVentana = new MostrarVentana();
        mostrarVentana.MVentana("Resources");
    }
    public void MVentana(String relativePathFolder){
        String archivo = new String();
        File[] archivos = (new File(relativePathFolder)).listFiles();
        String aux = "¿";
        for(int i = 0; i< archivos.length; i++){
             if(archivos[i].isFile()) {
                 if (i != archivos.length - 1) {
                     aux += archivos[i].getName() + " o ";
                 } else {
                     aux += archivos[i].getName() + "?";
                 }
             }
        }
        archivo = JOptionPane.showInputDialog(aux);
        File file = new File(relativePathFolder+"/"+archivo);
        try {
            Scanner scanner = new Scanner(file);
            String contenido = new String();
            while (scanner.hasNextLine()){
                contenido += scanner.nextLine() + "\n";
            }
            JOptionPane.showMessageDialog(null, contenido);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
    }
}
