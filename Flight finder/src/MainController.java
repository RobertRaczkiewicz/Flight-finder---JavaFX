import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import utils.DialogsUtils;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import utils.FxmlUtils;

import java.io.IOException;
import java.util.Optional;
import java.util.ResourceBundle;


public class MainController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    @FXML
    private void initialize() {
        topMenuButtonsController.setMainController(this);
    }

    public void setCenter (String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages_eng");
        loader.setResources(bundle);
        Parent parent;
        parent = loader.load();
        borderPane.setCenter(parent);
    }

    public void closeApplication() {
        Optional<ButtonType> result = DialogsUtils.confirmationDialog();
        if (result.get()==ButtonType.OK){
            System.exit(0);
        }

    }

    public void setCaspian() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }

    public void setModena() {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }

    public void setAlwaysOnTop(ActionEvent actionEvent) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        boolean value = ((CheckMenuItem) actionEvent.getSource()).selectedProperty().get();
        stage.setAlwaysOnTop(value);
    }

    public void aboutApplication() {
        DialogsUtils.dialogAboutApplication();
    }

}
