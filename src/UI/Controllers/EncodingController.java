package UI.Controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.ui.CommonDialogs;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Prog.Streams;
import Prog.Constants;
import javafx.stage.FileChooser;

public class EncodingController extends Constants {

    private String filePathIn;

    private String filePathOut;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addFilePathField;

    @FXML
    private TextField encodedKeyField;

    @FXML
    private TextField addFilePathField1;

    @FXML
    private Button encodedStartButton;
    @FXML
    private Button FileChooserOut;

    @FXML
    void initialize() {

        encodedStartButton.setOnAction(event -> {
            //String filePath = addFilePathField.getText().trim(); // создаем строку из поля, где вводится пусть к файлу с текстом

            String key = encodedKeyField.getText().trim(); // создаем строку с ключом
            //String filePathOut = addFilePathField1.getText().trim();
            if(!filePathIn.equals("") && !key.equals("") && !filePathOut.equals("")){ // проверяем, чтобы поля не были пустыми

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

                int modifier = Constants.MODIFIER_CODING;
                try {
                    stream.writeStream(filePathOut, text, Integer.parseInt(key), modifier);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //метод
            }
            else System.out.println("Error");
        });
    }
    @FXML
    void fileChooserIn (javafx.event.ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        // выбор типа файлов, которые будут доступны в диалоговоом окне
        // если не писать эту строку, то можно выбрать любой тип файлов
        //fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT Files", ".txt"));
        File file = fileChooser.showOpenDialog(null); // вызов диалогового окна, для выбора файлов
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
