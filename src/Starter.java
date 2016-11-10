import businessLogic.Pet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

package businessLogic;


public class Starter {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
    File pets = new File("pets.txt");
    FileReader fr = new FileReader(pets);
    char[] input;
    BufferedReader bin = new BufferedReader(fr);
    String word;
    
    System.out.println("Seleccione una de las siguientes opciones");
    System.out.println("1. Remover mascota");
    System.out.println("2. Listar mascotas por ID de persona");
    System.out.println("3. Listar mascotas por Tipo");
    System.out.println("4. Finalizar y listar mascotas");
}
public void readPets(Vet v){
        return null;
    }
public void manageVet(Vet v, String action){
        return null;
} 

