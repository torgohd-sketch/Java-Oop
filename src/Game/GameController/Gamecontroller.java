package Game.GameController;
import Game.GameController.GameModel.Gamemodel;
import Game.GameController.GameView.Gameview;


public class Gamecontroller {
    private Gamemodel model;
    private Gameview view;
     private int minimo; 
    private int maximo;


    public Gamecontroller(int minimo, int maximo){
          this.minimo = minimo; 
         this.maximo = maximo;
        this.view = new Gameview();
        this.model = new Gamemodel(minimo, maximo);
    }

    public void jugarRonda(){

    
        view.mostrarBienvenida(this.minimo, this.maximo);

        boolean adivino = false;

        while (!adivino){

             int intento = view.pedirnumero(this.minimo, this.maximo);

             int resultado = model.verificarIntentos(intento);

             if (resultado == 0) {
             int intentos = model.getIntentos();
            view.mostrarVictoria(intentos);
            adivino = true; 
            
        } else if (resultado == -1) {
            view.mostrarMuyBajo();
            
        } else if (resultado == 1) {
            view.mostrarMuyAlto();
        }
    } 
}

    public void iniciar(){
    boolean jugarDeNuevo = true;
    
    while (jugarDeNuevo) {
        jugarRonda();
        jugarDeNuevo = view.preguntarSiJuegaDeNuevo();
        
        if (jugarDeNuevo) {
            model.reiniciar();
        }
    }
    }



}

