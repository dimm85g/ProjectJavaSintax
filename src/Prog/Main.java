package Prog;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    // C:\Java\ProjectJavaSintax\src\encodedText.txt

    public static void main(String[] args) throws IOException {
        System.out.println(Constants.MENU_TITLE);

        Scanner scannerKey = new Scanner(System.in);
        int choiceMethod = scannerKey.nextInt();

        Menu menu = new Menu();

        if (choiceMethod == 1) {   //метод дл€ кодировани€
            String filePathOutEncoded = "C:\\Java\\ProjectJavaSintax\\src\\encodedText.txt";
            menu.getMenu(choiceMethod, filePathOutEncoded);
        }
        else if (choiceMethod == 2) {
            String filePathOutDecoded = "C:\\Java\\ProjectJavaSintax\\src\\decodedText.txt";
            menu.getMenu(choiceMethod, filePathOutDecoded);
        }
        else if (choiceMethod == 3){
            menu.getMenuBF();
        }
        else {
            System.out.println("¬веден неправильный идиентификатор");
        }
    }
}
