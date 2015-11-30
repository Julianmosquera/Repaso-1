package rep1ap7y8;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap7y8 {

    public static void main(String[] args) {
        float lado;
        float area;
        do {
            do {
                lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado"));

            } while (lado < 0);
            if (lado != 0) {
                System.out.println("area es = " + lado * lado);

            } else {
                System.out.println("FIN");
            }

        } while (lado != 0);
    }
}
