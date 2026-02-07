package CalculatorController;
import CalculatorModel.Calculatormodel;
import CalculatorView.Calculatorview;

public class Calculatorcontroller {
    private Calculatormodel model;
    private Calculatorview view;
    
    public Calculatorcontroller() {
        this.model = new Calculatormodel();
        this.view = new Calculatorview();
    }
    
    public void ejecutarOperacion(){
        try {
            int operacion = view.pedirOperacion();
            double number1 = view.pedirNumero("Ingrese numero 1");
            double number2 = view.pedirNumero("Ingrese numero 2");
            double resultado = 0;
            
            if (operacion == 1){
                resultado = model.sumar(number1, number2);
            }
            else if (operacion == 2){
                resultado = model.restar(number1, number2);
            }
            else if (operacion == 3){
                resultado = model.multiplicar(number1, number2);
            }
            else if (operacion == 4){
                resultado = model.dividir(number1, number2);
            }
            
            view.mostrarResultado(resultado);
            
        } catch (IllegalArgumentException e) {
            view.mostrarError(e.getMessage());
        }
    }
    
    public void iniciar(){
        boolean continuar = true;
        
        while (continuar) {
            ejecutarOperacion();
            continuar = view.preguntarSiContinua();
        }
    }
}