package UI.Controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Prog.Constants;
import Prog.Streams;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.stage.FileChooser;

public class DecodingController {
    private String filePathIn;

    private String filePathOut;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FileChooserIn;

    @FXML
    private Button FileChooserOut;

    @FXML
    private TextField decodedKeyField;

    @FXML
    private Button decodedStartButton;

    @FXML
    void initialize() {

        decodedStartButton.setOnAction(event -> { decodedStartButton.getScene().getWindow().hide();

            String key = decodedKeyField.getText().trim(); // ������� ������ � ������

            if(!filePathIn.equals("") && !key.equals("") && !filePathOut.equals("")){ // ���������, ����� ���� �� ���� �������

                Streams stream = new Streams();
                try {
                    stream.createTextFile(filePathOut);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                String text = null;
                try {
                    text = stream.readStream(filePathIn);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                try {
                    stream.writeStream(filePathOut, text, Integer.parseInt(key), Constants.MODIFIER_DECODING);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //�����
            }
            else System.out.println("Error");
        });
    }
    @FXML
    void fileChooserIn (javafx.event.ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        // ����� ���� ������, ������� ����� �������� � ����������� ����
        // ���� �� ������ ��� ������, �� ����� ������� ����� ��� ������
        //fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT Files", ".txt"));
        File file = fileChooser.showOpenDialog(null); // ����� ����������� ����, ��� ������ ������
        if (file != null){
            filePathIn = file.getAbsolutePath();
        }
    }
    @FXML
    void fileChooserOut (javafx.event.ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        if (file != null){
            filePathOut = file.getAbsolutePath();
        }
    }
}

