
package principal;

import javax.swing.JOptionPane;
import model.Relogio;

public class Principal {
    public static void main(String[] args) {
        Relogio rlg = new Relogio(13, 55, 10);
//        
//        rlg.setHora(Integer.parseInt(JOptionPane.
//            showInputDialog("Digite as horas: ")));
//        
//        rlg.setMinuto(Integer.parseInt(JOptionPane.
//            showInputDialog("Digite os minutos: ")));
//        
//        rlg.setSegundo(Integer.parseInt(JOptionPane.
//            showInputDialog("Digite os segundos ")));
        
        JOptionPane.showMessageDialog(null, "O tempo total em segundos foi de " + rlg.getTempoSegundos());
    }
}
