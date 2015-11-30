
package rep1ap6;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap6 {

  
    public static void main(String[] args) {
        int lado;
        int area;
        
        lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
        area=lado*lado;
        
        JOptionPane.showMessageDialog(null,"El area es de : "+area);
    }
    
}
