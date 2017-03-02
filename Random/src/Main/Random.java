package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman 
 */
public class Random {

    public String contraseña() {

        char[] todo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la contraseña "));
        String pass = "";
        if (numero >= 8) {

            for (int i = 0; i < numero; i++) {
                int posicion = (int) Math.round(Math.random() * todo.length);
                pass = pass + todo[posicion];

            }
        } else {
            System.out.println("es muy poco");
        }

        return pass;
    }

}
