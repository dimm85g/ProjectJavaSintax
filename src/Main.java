import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Если нужно зашифровать текст, введите идиентификатор - 1");
        System.out.println("Есди нужно расшифровать текст с попщью ключа, введите идиентификатор - 2");
        System.out.println("Если нужно расшифровать текст с помощью метода brute force, введите идиентификатор - 3");
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int choiceMethod = scanner.nextInt();
        if (choiceMethod == 1){
            System.out.println("Введите путь к файлу");
            String filePath = sc.nextLine();
            System.out.println("Введите ключ");
            int key = scanner.nextInt();
            String text = Streams.readStream(filePath);
            System.out.println(text);
            System.out.println(Methods.coding(text, key));
            System.out.println("Текст закодирован!");
            //метод для кодирования
        }
        else if (choiceMethod == 2) {
            System.out.println("Введите путь к файлу");
            String filePath = sc.nextLine();
            System.out.println("Введите ключ");
            int key = scanner.nextInt();
            System.out.println("Путь: " + filePath + "   " + "Ключ: " + key);
            //метод раскодирования по ключу
        }
        else if (choiceMethod == 3){
            System.out.println("Введите путь к файлу");
            String filePath = scanner.nextLine();
            System.out.println("Путь: " + filePath);
            //метод брут форс
        }
        else {
            System.out.println("Введен неправильный идиентификатор");
        }
    }
}
