import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    public static void main(String[] args) throws IOException {
        System.out.println("���� ����� ����������� �����, ������� �������������� - 1" +
                " \n���� ����� ������������ ����� � ������ �����, ������� �������������� - 2" +
                " \n���� ����� ������������ ����� � ������� ������ brute force, ������� �������������� - 3");
        Scanner scannerKey = new Scanner(System.in);
        Scanner scannerPath = new Scanner(System.in);
        int choiceMethod = scannerKey.nextInt();
        if (choiceMethod == 1){   //����� ��� �����������
            System.out.println("������� ���� � �����");
            String filePath = scannerPath.nextLine();
            System.out.println("������� ����");
            int key = scannerKey.nextInt();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\encodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStream(filePathOut, text,key);
            System.out.println("����� �����������!");
        }
        else if (choiceMethod == 2) {
            System.out.println("������� ���� � �����");
            String filePath = scannerPath.nextLine();
            System.out.println("������� ����");
            int key = scannerKey.nextInt();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStreamDecoding(filePathOut,text,key);
            System.out.println("����� ������������!");
            //����� �������������� �� �����
        }
        else if (choiceMethod == 3){
            System.out.println("������� ���� � �����");
            String filePath = scannerPath.nextLine();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStreamDecodingBF(filePathOut, text);
            System.out.println("����� ������������!");
            //����� ���� ����
        }
        else {
            System.out.println("������ ������������ ��������������");
        }
    }
}
