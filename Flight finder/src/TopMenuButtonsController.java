import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class TopMenuButtonsController {

    public static final String LIST_OF_CITIES_FXML = "/fxml/ListOfCities.fxml";
    public static final String LIST_OF_FLIGHTS_FXML = "/fxml/ListOfFlights.fxml";
    public static final String LIST_OF_PRICES_FXML = "fxml/ListOfPrices.fxml";
    public static final String ADD_CITY_FXML = "/fxml/AddCity.fxml";
    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    public void openListOfCities() throws IOException {
        mainController.setCenter(LIST_OF_CITIES_FXML);
    }

    @FXML
    public void openListOfFlights() throws IOException {
        mainController.setCenter(LIST_OF_FLIGHTS_FXML);
    }

    @FXML
    public void openListOfPrices() throws IOException {
        mainController.setCenter(LIST_OF_PRICES_FXML);
    }

    @FXML
    public void addCity() throws IOException {
     if (toggleButtons.getSelectedToggle()!=null){
      toggleButtons.getSelectedToggle().setSelected(false);

      mainController.setCenter(ADD_CITY_FXML);
     }
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
