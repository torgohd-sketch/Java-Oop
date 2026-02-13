package Calculator.CalculatorController.CalculatorView;

import javax.swing.JOptionPane;

public class Calculatorview {


    public int pedirOperacion(){

    int operacionInt;
    String operacion = JOptionPane.showInputDialog(null, 
            "Seleccione la operacion que desea realizar:\n" +
            "1: Sumar\n" +
            "2: Restar\n" +
            "3: Multiplicar\n" +
            "4: Dividir");
        
    operacionInt = Integer.parseInt(operacion);

    while (operacionInt < 1 || operacionInt > 4) {
        JOptionPane.showMessageDialog(null, "Operacion no valida");
         operacion = JOptionPane.showInputDialog(null, 
            "Seleccione la operacion que desea realizar:\n" +
            "1: Sumar\n" +
            "2: Restar\n" +
            "3: Multiplicar\n" +
            "4: Dividir");
    }

    return operacionInt;

    }


    public double pedirNumero(String mensaje){

        String Numero1 = JOptionPane.showInputDialog(null, mensaje);
        double numero = Double.parseDouble(Numero1);
        return numero;

    }

    public boolean preguntarSiContinua(){

        String Volverintento = JOptionPane.showInputDialog(null, "Desea hacer otra operacion?\n" + "1: si\n" + "2: no");
    int volverintentar = Integer.parseInt(Volverintento);

    if (volverintentar == 1){
        return true;
    }

    else {
        return false;
    }
    }

    public void mostrarResultado(double resultado) {
    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
}

public void mostrarError(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
}

    
}