public class Methods {
    public static char[] coding (String text, int key) {
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '"', ':', '-', '!', '?', ' '};
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
        char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '"', ':', '-', '!', '?', ' '};
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
    public static char[] brutForce (String text){
        char[] array = new char[text.length()];
        for (int i = 1; i < 40; i++){
            array = Methods.coding(text, i);
            int numberOfElements = array.length;
            int ratio = 17;//  В среднем в русском языке встречается 174 пробела на 1000 символов.
            int numberOfSpace = 0;
            for (int k = 0; k < array.length; k++){ // считаем количество пробелов в нашем тексте
                if (array[k] == ' '){
                    numberOfSpace++;
                }
            }
            int numberOfSpaceRatio = numberOfSpace * 100 / numberOfElements; // считаем процент содержания пробелов в нашем тексте
            if (numberOfSpaceRatio < (ratio + 2) && numberOfSpaceRatio > (ratio - 4)) break;
        }
        return array;
    }
}
