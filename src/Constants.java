public class Constants {
    protected static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
                    'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '"', ':', '-', '!', '?', ' '};
    protected static final int DELTA_PLUS = 2;
    protected static final int DELTA_MINUS = 4;

    protected static final int MODIFIER_CODING = 1; //

    protected static final int MODIFIER_DECODING = -1; // It is used to turn the key in the opposite direction, when decrypting by key
    protected static final String MENU_TITLE = "Если нужно зашифровать текст, введите идиентификатор - 1" +
            "\nЕсли нужно расшифровать текст с попщью ключа, введите идиентификатор - 2" +
            "\nЕсли нужно расшифровать текст с помощью метода brute force, введите идиентификатор - 3";
}
