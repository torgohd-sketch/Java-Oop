import Calculator.CalculatorController.Calculatorcontroller;
import Game.GameController.Gamecontroller;
import Todo.TodoController.todocontroller;
public class App {
    public static void main(String[] args) throws Exception {

       // Gamecontroller game = new Gamecontroller(1, 20);

      // game.iniciar();

       // Calculatorcontroller Calculator = new  Calculatorcontroller();

      // Calculator.iniciar();
      //  Calculator.ejecutarOperacion();

        todocontroller controlador = new todocontroller();
        // Arrancamos la aplicación
        controlador.iniciar();
    }
}
