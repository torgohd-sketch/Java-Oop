import Calculator.CalculatorController.Calculatorcontroller;
import Game.GameController.Gamecontroller;

public class App {
    public static void main(String[] args) throws Exception {

       Gamecontroller game = new Gamecontroller(1, 20);

       game.iniciar();

       // Calculatorcontroller Calculator = new  Calculatorcontroller();

      // Calculator.iniciar();
      //  Calculator.ejecutarOperacion();
    }
}
