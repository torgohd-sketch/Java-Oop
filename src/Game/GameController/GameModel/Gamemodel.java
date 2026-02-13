package Game.GameController.GameModel;

import java.util.Random;

public class Gamemodel{

    private int secretnumero;
    private int intentos;
    private int minimo;
    private int maximo;
    

    public Gamemodel(int minimo, int maximo){  
    this.intentos = 0;
    this.minimo = minimo;
    this.maximo = maximo;
    numerorandom();
}

    public void numerorandom(){

        Random random = new Random();

        secretnumero = random.nextInt(maximo - minimo + 1) + minimo;


    }

    public int verificarIntentos(int intento){

        this.intentos ++;

        if (intento == this.secretnumero) {
        return 0;  
         } else if (intento < this.secretnumero) {
        return -1;  
         }  else {
        return 1;  
         }

         }

         public int getIntentos(){
            return this.intentos;
         }

        public void reiniciar(){
            this.intentos = 0;
            numerorandom();
        }
}
