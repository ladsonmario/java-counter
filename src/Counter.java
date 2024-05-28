import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
		try {            
            Scanner terminal = new Scanner(System.in);

            int numberOne = setNumber("Digite o primeiro número!", terminal);
            int numberTwo = setNumber("Digite o segundo número!", terminal);      
            
            terminal.close();

			count(numberOne, numberTwo);		
		} catch (InvalidParamsException exception) {
            System.out.println("Error: " + exception.getMessage());			
		}		
    }

    static int setNumber(String message, Scanner terminal) throws InvalidParamsException {        
        System.out.println(message);
        int number = 0;
        
        if(terminal.hasNextInt()) {
            number = terminal.nextInt();
        } else {
            throw new InvalidParamsException("Esse número não é um inteiro!");
        }

        return number;
    }
	
    static void count(int numberOne, int numberTwo) throws InvalidParamsException {
        if(numberOne > numberTwo) throw new InvalidParamsException("O segundo parâmetro deve ser maior que o primeiro!");		        
        if(numberOne == numberTwo) throw new InvalidParamsException("Os números não podem ser iguais!");
		
		int count = numberTwo - numberOne;
		
        for(int i = 1; i <= count; i++) {
            System.out.println("Essa aplicação possui " + i + " erros! kkkkkkkk");
        }
	}
}

class InvalidParamsException extends Exception {
    public InvalidParamsException(String message) {
        super(message);
    }
}