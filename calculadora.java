/**
 * Interface with the basic operations of a calculator
 * @author Ana Ramirez, Diego Perdomo y Elisa Samayoa
 */
public interface calculadora 
{
    /**
     * Method to add two numbers
     * @param x First number to add
     * @param y Second number to add
     * @return Result
     */
    public int suma(int x, int y);

    
    /**
     * Method to subtract two numbers
     * @param x Minuend
     * @param y Subtrahend
     * @return Result
     */
    public int resta(int x, int y);

   
    /**
     * Method to multiply
     * @param x First number
     * @param y Second number
     * @return Result
     */
    public int multiplicacion(int x, int y);
    
    
    /**
     * Method to divide
     * @param x Dividend
     * @param y Divider
     * @return Result
     */
    public int division(int x, int y);


    /**
     * Method to operate
     * @param x Stack in Postfix format
     * @return result of the operation
     */
    public int operar(stack x);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    

    /**
     * Method to read an .txt and decode its content
     * @param a Location of the .txt
     * @return Content of .txt 
     */
    public String decode(String a);//función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}