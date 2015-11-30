package rep1ap4;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap4 {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            int num = validar();
            System.out.println(num);
        }

    }

    public static int validar() {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero positivo:"));
        } while (num < 0);
        return num;
    }

}
