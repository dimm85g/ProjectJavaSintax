import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("���� ����� ����������� �����, ������� �������������� - 1");
        System.out.println("���� ����� ������������ ����� � ������ �����, ������� �������������� - 2");
        System.out.println("���� ����� ������������ ����� � ������� ������ brute force, ������� �������������� - 3");
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int choiceMethod = scanner.nextInt();
        if (choiceMethod == 1){
            System.out.println("������� ���� � �����");
            String filePath = sc.nextLine();
            System.out.println("������� ����");
            int key = scanner.nextInt();
            String text = Streams.readStream(filePath);
            System.out.println(text);
            System.out.println(Methods.coding(text, key));
            System.out.println("����� �����������!");
            //����� ��� �����������
        }
        else if (choiceMethod == 2) {
            System.out.println("������� ���� � �����");
            String filePath = sc.nextLine();
            System.out.println("������� ����");
            int key = scanner.nextInt();
            System.out.println("����: " + filePath + "   " + "����: " + key);
            //����� �������������� �� �����
        }
        else if (choiceMethod == 3){
            System.out.println("������� ���� � �����");
            String filePath = scanner.nextLine();
            System.out.println("����: " + filePath);
            //����� ���� ����
        }
        else {
            System.out.println("������ ������������ ��������������");
        }
    }
}
