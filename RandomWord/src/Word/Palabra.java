package Word;

/**
 *
 * @author By Gatoman 
 */
public class Palabra {

    char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
        'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'V',
        'W', 'X', 'Y', 'Z'};

    public char oneChar() {
        int position = (int) Math.floor(Math.random() * alphabet.length);
        return alphabet[position];
    }

    public String createWord(int quantity) {
        //int quantity = 15;
        String word = "";

        for (int i = 0; i < quantity; i++) {
            int position = (int) Math.floor(Math.random() * alphabet.length);
            word = word + alphabet[position];
        }
        return word;
    }
}
