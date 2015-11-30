package rep1ap5;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Rep1ap5 {

    public static void main(String[] args) {
        
       int num;
        int suma=0;
       for(int i=0;i<4;i++){
          
           do{  
             num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero:"));
            } 
             while(num<0);
           suma+=num;
         System.out.println(num);}
        System.out.println(suma);
           
           
           
           
         
    } }