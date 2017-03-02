package Word;

/**
 *
 * @author By Gatoman 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palabra paa = new Palabra();
        paa.oneChar();
        String pala = paa.createWord(10);
        System.out.println(pala);
        
    }

}
