package UI.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button bruteForceButton;

        @FXML
        private Button decodingButton;

        @FXML
        private Button encryptionButton;

        @FXML
        private Button statisticalAnalysisButton;

        @FXML
        void initialize() {
            encryptionButton.setOnAction(event -> {/*encryptionButton.getScene().getWindow().hide();*/// по нажатию кнопки мы скрываем стартовое окно
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/UI/view/encodingScene.fxml")); // берем новое окно по адресу где оно находится
            try {
                loader.load(); // загружаем это окно
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

            decodingButton.setOnAction(event -> {/*decodingButton.getScene().getWindow().hide();*/
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/UI/view/decodingScene.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });

            bruteForceButton.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/UI/view/bruteForceScene.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });

            statisticalAnalysisButton.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/UI/view/statisticalAnalysisScene.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });
        }
    }
