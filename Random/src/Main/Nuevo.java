package Main;

import Main.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman 
 */
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = 1;

        Random pala = new Random();

        String password = pala.contraseña();
        System.out.println(password);
        String nuevo = password;
        for (int i = 0; i < nuevo.length(); i++) {
            if (nuevo.charAt(i) < 10) {
                tamaño++;
            }
        }
        if (tamaño >= 5) {
            System.out.println("La contraseña en segura");
        } else {
            System.out.println("La contraseña en insegura");
        }
    }

}
