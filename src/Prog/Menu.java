package Prog;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void getMenu (int choiceMethod, String filePathOut) throws IOException {
        Scanner scannerKey = new Scanner(System.in);
        Scanner scannerPath = new Scanner(System.in);

        System.out.println("������� ���� � �����");
        String filePath = scannerPath.nextLine();

        System.out.println("������� ����");
        int key = scannerKey.nextInt();

        Streams stream = new Streams();
        stream.createTextFile(filePathOut);
        String text = stream.readStream(filePath);

        if (choiceMethod == 1) {
            int modifier = Constants.MODIFIER_CODING;
            stream.writeStream(filePathOut, text,key, modifier);
            System.out.println("����� �����������!");
        }
        else if (choiceMethod == 2){
            int modifier = Constants.MODIFIER_DECODING;
            stream.writeStream(filePathOut, text, key, modifier);
            System.out.println("����� ������������!");
        }
    }
    public void getMenuBF() throws IOException{
        System.out.println("������� ���� � �����");
        Scanner scannerPath = new Scanner(System.in);

        String filePath = scannerPath.nextLine();
        String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";

        Streams stream = new Streams();
        stream.createTextFile(filePathOut);
        String text = stream.readStream(filePath);

        stream.writeStreamDecodingBF(filePathOut, text);
        System.out.println("����� ������������!");
    }
}
