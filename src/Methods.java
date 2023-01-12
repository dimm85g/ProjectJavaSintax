public class Methods {
    public static char[] coding (String text, int key) {
        char[] alphabet = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î', 'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ', '.', ',', '"', ':', '-', '!', '?', ' '};
        char[] arrayText = text.toLowerCase().toCharArray();
        char[] codedText = new char[arrayText.length];
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
                    int indexForCode = (index + key) % alphabet.length;
                    if (indexForCode >= 0) {
                        codedText[i] = (alphabet[indexForCode]);
                    } else {
                        codedText[i] = (alphabet[indexForCode + alphabet.length]);
                    }
                }
        }
        return codedText;
    }

    public static char[] decoding(String text, int key){
        char[] alphabet = {'à', 'á', 'â', 'ã', 'ä', 'å', '¸', 'æ', 'ç', 'è', 'é', 'ê', 'ë', 'ì', 'í', 'î', 'ï', 'ð', 'ñ', 'ò', 'ó', 'ô', 'õ', 'ö', '÷', 'ø', 'ù', 'ú', 'û', 'ü', 'ý', 'þ', 'ÿ', '.', ',', '"', ':', '-', '!', '?', ' '};
        char[] arrayText = text.toLowerCase().toCharArray();
        char[] codedText = new char[arrayText.length];
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
                int indexForCode = (index + key * -1) % alphabet.length;
                if (indexForCode >= 0) {
                    codedText[i] = (alphabet[indexForCode]);
                } else {
                    codedText[i] = (alphabet[indexForCode + alphabet.length]);
                }
            }
        }
        return codedText;
    }
}
