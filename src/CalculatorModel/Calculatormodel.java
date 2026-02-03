package CalculatorModel;


public class Calculatormodel {

public int sumar(int number1, int number2) {
return number1 + number2;
    }
public int restar(int number1, int number2) {
return number1 - number2;
    }
public int multiplicar(int number1, int number2) {
return number1 * number2;   
    }
public double dividir(int number1, int number2) {
if (number2 == 0) {
throw new IllegalArgumentException("No se puede dividir por cero");
        }
return (double) number1 / number2;
    }
}