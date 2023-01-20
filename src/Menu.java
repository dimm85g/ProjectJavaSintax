import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void getMenu (int choiceMethod, String filePathOut) throws IOException {
        Scanner scannerKey = new Scanner(System.in);
        Scanner scannerPath = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String filePath = scannerPath.nextLine();
        System.out.println("Введите ключ");
        int key = scannerKey.nextInt();

        Streams.createDecodedTextFile(filePathOut);
        String text = Streams.readStream(filePath);

        if (choiceMethod == 1) {
            Streams.writeStream(filePathOut, text,key);
            System.out.println("Текст закодирован!");
        }
        else if (choiceMethod == 2){
            Streams.writeStreamDecoding(filePathOut, text, key);
            System.out.println("Текст раскодирован!");
        }
    }
    public void getMenuBF() throws IOException{
        System.out.println("Введите путь к файлу");
        Scanner scannerPath = new Scanner(System.in);
        String filePath = scannerPath.nextLine();
        String filePathOut = "C:\\Java\\ProjectJavaSintax\\src\\decodedText.txt";
        Streams.createDecodedTextFile(filePathOut);
        String text = Streams.readStream(filePath);
        Streams.writeStreamDecodingBF(filePathOut, text);
        System.out.println("Текст раскодирован!");
    }
}
