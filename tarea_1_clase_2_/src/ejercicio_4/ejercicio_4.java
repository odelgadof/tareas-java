/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;
import javax.swing.*;
/**
 *
 * @author Orvin
 */
public class ejercicio_4 {
     public static void main(String []agrs)
    {
        int op=0;
        double n1,n2,s,m,d,r;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("nCalculadoran"+
            "************n"+
            "[1] SUMAR"+
            "[2] RESTAR"+
            "[3] MULTIPLICAR"+
            "[4] DIVIDIR"+
            "[5] SALIR"+
            "Ingresa una opcion:"));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+s);
                    break;
                case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r=n1-n2;
                    JOptionPane.showMessageDialog(null,"La resta es:"+r);
                    break;
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    m=n1*n2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es:"+m);
                    break;
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    d=n1/n2;
                    JOptionPane.showMessageDialog(null,"La division es:"+d);
                    break;

            }
        }while(op!=5);
    }
    
}
