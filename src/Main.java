import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    // C:\Java\ProjectJavaSintax\src\encodedText.txt

    public static void main(String[] args) throws IOException {
        System.out.println("Если нужно зашифровать текст, введите идиентификатор - 1" +
                "\nЕсли нужно расшифровать текст с попщью ключа, введите идиентификатор - 2" +
                "\nЕсли нужно расшифровать текст с помощью метода brute force, введите идиентификатор - 3");

        Scanner scannerKey = new Scanner(System.in);
        int choiceMethod = scannerKey.nextInt();

        if (choiceMethod == 1) {   //метод для кодирования
            Menu menu = new Menu();
            String filePathOutEncoded = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\encodedText.txt";
            menu.getMenu(choiceMethod, filePathOutEncoded);
        }
        else if (choiceMethod == 2) {
            Menu menu = new Menu();
            String filePathOutDecoded = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";
            menu.getMenu(choiceMethod, filePathOutDecoded);
        }
        else if (choiceMethod == 3){
            Menu menu = new Menu();
            menu.getMenuBF();
        }
        else {
            System.out.println("Введен неправильный идиентификатор");
        }
    }
}
