package rep1ap3;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap3 {

    public static void main(String[] args) {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero cualquiera. PULSA CERO SI QUIERES TERMIANAR"));
            System.out.println(num);
        } while (num != 0);
    }

}
