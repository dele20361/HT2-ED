import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Class that simulates a calculator
 * 
 * @author Paola De León
 */
public class Calcu {
    public static void main(String[] args) {

        // Attributes 
        Scanner scan = new Scanner(System.in);
        Operaciones op = new Operaciones();


        // Welcome
        System.out.println("\n\nBienvenido al simulador de una calculadora");
        // Count the lines in the file
        int Num = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            while (reader.readLine() != null) {
                Num++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }

        for (int cant = 0; cant < Num; cant++) {
            stack s = new stack();
            String operation = op.decode("datos.txt");
            for (int i = 0; i <= operation.length()-1; i++) {
                char c = operation.charAt(i);
                String data = Character.toString(c);
                if ( !data.equals(" ")) {
                    s.push(data);
                }
            }

            int answer = op.operar(s);
            System.out.println("\n- La respuesta de " + operation + " es: " + answer);

        }
        

        // Close scanner
        scan.close();
    }
}