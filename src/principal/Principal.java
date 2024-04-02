
package principal;

import javax.swing.JOptionPane;
import model.Relogio;

public class Principal {
    public static void main(String[] args) {
        Relogio rlg = new Relogio(12, 12, 12);
        
//        rlg.incrementarSegundo(); 
//        rlg.incrementarMinuto();// caso o relogio esteja em 59 segundos e o incrementarSegundo() for chamado junto, vai incrementar 2 minutos.
//        rlg.incrementarHora();// caso o relogio esteja em 59 minutos e o incrementarMinuto() for chamado junto, vai incrementar 2 horas.
        rlg.decrementarSegundo();
        rlg.decrementarMinuto(); // caso o relogio esteja em 0 segundos e o decrementarSegundo() for chamado junto, vai diminuir 2 minutos.
        rlg.decrementarHora();// caso o relogio esteja em 0 minutos e o decrementarMinuto() for chamado junto, vai diminuir 2 horas.

        JOptionPane.showMessageDialog(null, "São exatamente: " + rlg.getHora() + " horas, " + rlg.getMinuto() +
                " minutos e " + rlg.getSegundo() + " segundos.\nO tempo total em segundos é de " + rlg.getTempoEmSegundos() + " segundos");
    }
}
