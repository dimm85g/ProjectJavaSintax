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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

public class BruteForceController {

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
    private Button decodedStartButton;

    void initialize() {

        decodedStartButton.setOnAction(event -> {

            if(!filePathIn.equals("") && !filePathOut.equals("")){ // проверяем, чтобы поля не были пустыми

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
                    stream.writeStreamDecodingBF(filePathIn, text);
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


