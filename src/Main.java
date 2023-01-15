import java.io.IOException;
import java.util.Scanner;

public class Main {
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\text.txt
    // C:\Users\Dima\IdeaProjects\ProjectJavaSintax\src\encodedText.txt
    public static void main(String[] args) throws IOException {
        System.out.println("Если нужно зашифровать текст, введите идиентификатор - 1" +
                " \nЕсли нужно расшифровать текст с попщью ключа, введите идиентификатор - 2" +
                " \nЕсли нужно расшифровать текст с помощью метода brute force, введите идиентификатор - 3");
        Scanner scannerKey = new Scanner(System.in);
        Scanner scannerPath = new Scanner(System.in);
        int choiceMethod = scannerKey.nextInt();
        if (choiceMethod == 1){   //метод для кодирования
            System.out.println("Введите путь к файлу");
            String filePath = scannerPath.nextLine();
            System.out.println("Введите ключ");
            int key = scannerKey.nextInt();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\encodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStream(filePathOut, text,key);
            System.out.println("Текст закодирован!");
        }
        else if (choiceMethod == 2) {
            System.out.println("Введите путь к файлу");
            String filePath = scannerPath.nextLine();
            System.out.println("Введите ключ");
            int key = scannerKey.nextInt();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStreamDecoding(filePathOut,text,key);
            System.out.println("Текст раскодирован!");
            //метод раскодирования по ключу
        }
        else if (choiceMethod == 3){
            System.out.println("Введите путь к файлу");
            String filePath = scannerPath.nextLine();
            String filePathOut = "C:\\Users\\Dima\\IdeaProjects\\ProjectJavaSintax\\src\\decodedText.txt";
            Streams.createDecodedTextFile(filePathOut);
            String text = Streams.readStream(filePath);
            Streams.writeStreamDecodingBF(filePathOut, text);
            System.out.println("Текст раскодирован!");
            //метод брут форс
        }
        else {
            System.out.println("Введен неправильный идиентификатор");
        }
    }
}
