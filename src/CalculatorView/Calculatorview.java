package CalculatorView;

import javax.swing.JOptionPane;

public class Calculatorview {


    public int Pedioperacion(){

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


    public double PedirNumero1(){

        String Numero1 = JOptionPane.showInputDialog(null, "ingresa numero 1");
        double number1 = Integer.parseInt(Numero1);
        return number1;

    }

    public double pedirNumero2(){

        String Numero2 = JOptionPane.showInputDialog(null, "ingresa numero 2");
        double number2 = Integer.parseInt(Numero2);
        return number2;
    }

    public boolean Volver(){

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

    
}