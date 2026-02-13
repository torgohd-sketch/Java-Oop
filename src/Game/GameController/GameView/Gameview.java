    package Game.GameController.GameView;

    import javax.swing.JOptionPane;

    public class Gameview {

        public int pedirnumero(int minimo, int maximo){
            int numero = 0;

            while (numero < minimo || numero > maximo) {
                String numeropedir = JOptionPane.showInputDialog("que numero desea intentar? del " + minimo + "al " + maximo);
                numero = Integer.parseInt(numeropedir);

                    if (numero < minimo || numero > maximo){
                        JOptionPane.showMessageDialog(null, "Numero ha de ser del " + minimo + "al " + maximo);
                    }
            }
            return numero;
        }

        public void mostrarMuyAlto(){
            JOptionPane.showMessageDialog(null, "Muy alto el numero, pruebe con uno mas bajo");
        }

        public void mostrarMuyBajo(){
            JOptionPane.showMessageDialog(null, "Muy bajo el numero, pruebe con uno mas Alto");
        }

        public void mostrarVictoria(int intentos){
            JOptionPane.showMessageDialog(null, "Has ganado en: " + intentos + " intentos!");
        }

        public boolean preguntarSiJuegaDeNuevo(){
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
        return respuesta == JOptionPane.YES_OPTION;
        }

         public void mostrarBienvenida(int minimo, int maximo){
        JOptionPane.showMessageDialog(null, "¡Bienvenido! Adivina el número entre " + minimo + " y " + maximo);
    }

        
    }
