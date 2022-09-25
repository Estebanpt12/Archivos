package mostrarContenidoRecursivo;

import java.io.File;

public class MostrarContenidoRecursivo {

    public static void main(String[] args) {
        File directorioPadre = new File("Resources");
        MostrarContenidoRecursivo mostrarContenidoRecursivo = new MostrarContenidoRecursivo();
        mostrarContenidoRecursivo.imprimirContenido(directorioPadre);
    }

    public void imprimirContenido(File archivo){
        if(archivo!=null){
            imprimirContenidoPrivado(archivo.listFiles(), 0);
        }
    }

    private void imprimirContenidoPrivado (File[] archivos, int index){
        System.out.println(archivos[index].getName());
        if(archivos[index].isDirectory()){
            imprimirContenidoPrivado(archivos[index].listFiles(), 0);
        }
        if(index + 1 < archivos.length){
            imprimirContenidoPrivado(archivos, index + 1);
        }
    }
}
