import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    // C:\Java\ProjectJavaSintax\src\encodedText.txt

    public static void main(String[] args) throws IOException {
        System.out.println("���� ����� ����������� �����, ������� �������������� - 1" +
                "\n���� ����� ������������ ����� � ������ �����, ������� �������������� - 2" +
                "\n���� ����� ������������ ����� � ������� ������ brute force, ������� �������������� - 3");

        Scanner scannerKey = new Scanner(System.in);
        int choiceMethod = scannerKey.nextInt();

        if (choiceMethod == 1) {   //����� ��� �����������
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
            System.out.println("������ ������������ ��������������");
        }
    }
}
