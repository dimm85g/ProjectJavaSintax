package Prog;

public class Methods {
    final char[] alphabet = Constants.ALPHABET;
    public char[] coding (String text, int key, int modifier) {
        char[] arrayText = text.toLowerCase().toCharArray();
        char[] codedText = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = arrayText[i];
            int tik = 0;
            for (int j = 0; j < alphabet.length; j++) {
                    if (symbol == alphabet[j]) {
                        index = j;
                        break;
                    }
                    else {
                        codedText[i] = symbol;
                        tik++;
                    }
                }
                if (tik < alphabet.length) {
                    int indexForCode = (index + key * modifier) % alphabet.length;
                    if (indexForCode >= 0) {
                        codedText[i] = (alphabet[indexForCode]);
                    } else {
                        codedText[i] = (alphabet[indexForCode + alphabet.length]);
                    }
                }
        }
        return codedText;
    }
     public char[] brutForce (String text){
        char[] array = new char[text.length()];
        for (int i = 1; i < 40; i++){
            Methods method = new Methods();
            int modifier = Constants.MODIFIER_CODING;
            array = method.coding(text, i, modifier);
            int numberOfElements = array.length;
            int ratio = 17;                         //  On average, there are 174 spaces per 1000 characters in the Russian language.
            int numberOfSpace = 0;
            for (int k = 0; k < array.length; k++){ // counting the number of spaces in our text
                if (array[k] == ' '){
                    numberOfSpace++;
                }
            }
            int numberOfSpaceRatio = numberOfSpace * 100 / numberOfElements; // we count the percentage of the content of spaces in our text
            if (numberOfSpaceRatio < (ratio + Constants.DELTA_PLUS) && numberOfSpaceRatio > (ratio - Constants.DELTA_MINUS)) break;
        }
        return array;
    }
}
