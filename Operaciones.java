import java.util.ArrayList;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Operaciones implements calculadora {

    private ArrayList<String> content;
    private static int counter = 0;

    public Operaciones() {
        content = new ArrayList<String>(); 
    }

    /**
     * Getter of the ArrayList that contains the contect of the file
     */
    public ArrayList<String> getContent() { return content; }

    @Override
    public int suma(int x, int y) {
        return x+y;
    }

    @Override
    public int resta(int x, int y) {
        return x-y;
    }

    @Override
    public int multiplicacion(int x, int y) {
        return x*y;
    }

    @Override
    public int division(int x, int y) {
        int anws = 0;
        if (y!=0){
            anws = x/y;
        }
        return anws;
    }

    @Override
    public int operar( stack x ) {
        // Sacar 
        Stack<String> operadores = new Stack<String>();
        Stack<Integer> operandos = new Stack<Integer>();
        for (int i = 0; i < x.size()+20; i++) {
            String temp = x.pop();
            int num = 0;
            if ( temp.equals("1") || temp.equals("2") || temp.equals("3") || temp.equals("4") || temp.equals("5") || temp.equals("6") || temp.equals("7") || temp.equals("8") || temp.equals("9") ) {
                num = Integer.parseInt(temp);
                operandos.push(num);
                operandos.size();
            } else if (temp.equals("+") || temp.equals("-")|| temp.equals("*")|| temp.equals("/")) {
                operadores.push(temp);
            } 
        }
        
        do {
            int num1 = operandos.pop();
            int num2 = operandos.pop();
            String op = operadores.pop();
            int resultI = 0;
            switch (op) {
                case "+":
                    resultI = suma(num1, num2);
                    operandos.push(resultI);
                    break;
                case "/":
                    resultI = division(num1, num2);
                    operandos.push(resultI);
                    break;
                case "*":
                    resultI = multiplicacion(num1, num2);
                    operandos.push(resultI);
                    break;
                case "-":
                    resultI = resta(num1, num2);
                    operandos.push(resultI);
                    break;

                default:
                    break;
            }
        } while (operadores.size()>0);

        int answer = operandos.pop();

        return answer;
    }

    @Override
    public String decode(String a) {
        String line = "";
        try {
            File file = new File (a);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine())!=null) {
                content.add(line);
            }
            br.close();
        } catch (Exception e) {
            line += "File not founded";
        }

        int cont = Counter();
        counter++;
    
        return content.get(cont);
    }

    /**
     * Method to know which line to retun
     * @return
     */
    public int Counter () {
        if (counter<content.size()){
            content.get(counter);
        } else {
            counter = 0;
        }

        return counter;
    }
    
}
