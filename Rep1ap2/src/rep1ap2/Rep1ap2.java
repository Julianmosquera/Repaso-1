package rep1ap2;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap2 {

  
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
          int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero")); 
          JOptionPane.showMessageDialog(null,num);
        }
    }
    
}
