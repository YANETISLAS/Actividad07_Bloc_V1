package models;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class ModelBloc {
    private String texto = "Hola.. ";

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void readFile(){
        try{
            String path = "C:\\archivos\\archivo.txt";
            String row;
            try (FileReader file = new FileReader(path)){
                BufferedReader bufferedReader = new BufferedReader(file);
                while((row = bufferedReader.readLine()) != null) {
                    System.out.println(row);
                }
                bufferedReader.close();
            }
            }
            catch(FileNotFoundException err){
                    System.err.println("Archivo no encontrado: " + err.getMessage());      
            }//catch
            catch(IOException err){
                System.err.println("Error de entrada y salida: " + err.getMessage());
            }
    }//readFile
      public void writeFile(){
        try{
            String path = "C:\\archivos\\archivo.txt";
            
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try(PrintWriter printWriter = new PrintWriter(fileWriter))
            {
                printWriter.println(texto);
                printWriter.close();
            }
            }//try
            catch(FileNotFoundException err){
                System.err.println("Archivo no encontrado: " + err.getMessage());
            }
            catch(IOException err){
                System.err.println("Error de entrada y salida: " + err.getMessage());
            }
}
      
      
}
