import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\decodedText.txt
    public static void main(String[] args) throws IOException {
        System.out.println("���� ����� ����������� �����, ������� �������������� - 1" +
                " \n���� ����� ������������ ����� � ������ �����, ������� �������������� - 2" +
                " \n���� ����� ������������ ����� � ������� ������ brute force, ������� �������������� - 3");
        Scanner scanner = new Scanner(System.in);
        Scanner scannerIn = new Scanner(System.in);
        Scanner scannerOut = new Scanner(System.in);
        int choiceMethod = scanner.nextInt();
        if (choiceMethod == 1){   //����� ��� �����������
            System.out.println("������� ���� � �����");
            String filePath = scannerIn.nextLine();
            System.out.println("������� ����");
            int key = scanner.nextInt();
            System.out.println("������� ���� � ����� � ������� ��������� �������������� �����");
            String filePathOut = scannerOut.nextLine();
            String text = Streams.readStream(filePath);
            Streams.writeStream(filePathOut, text,key);
            System.out.println("����� �����������!");
        }
        else if (choiceMethod == 2) {
            System.out.println("������� ���� � �����");
            String filePath = scannerIn.nextLine();
            System.out.println("������� ����");
            int key = scanner.nextInt();
            System.out.println("������� ���� � ����� � ������� ��������� ��������������� �����");
            String filePathOut = scannerOut.nextLine();
            String text = Streams.readStream(filePath);
            Streams.writeStreamDecoding(filePathOut,text,key);
            System.out.println("����� ������������!");
            //����� �������������� �� �����
        }
        else if (choiceMethod == 3){
            System.out.println("������� ���� � �����");
            String filePath = scannerIn.nextLine();
            System.out.println("������� ���� � ����� � ������� ��������� ��������������� �����");
            String filePathOut = scannerOut.nextLine();



            System.out.println("����� ������������!");
            //����� ���� ����
        }
        else {
            System.out.println("������ ������������ ��������������");
        }
    }
}
