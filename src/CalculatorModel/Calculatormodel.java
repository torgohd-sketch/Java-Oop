package CalculatorModel;


public class Calculatormodel {

public double sumar(double number1, double number2) {
return number1 + number2;
    }
public double restar(double number1, double number2) {
return number1 - number2;
    }
public double multiplicar(double number1, double number2) {
return number1 * number2;   
    }
public double dividir(double number1, double number2) {
if (number2 == 0) {
throw new IllegalArgumentException("No se puede dividir por cero");
        }
return (double) number1 / number2;
    }
}