package your;


import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Label Algorithimlabel1;


    @FXML
    private ChoiceBox<String> mychoicebox1;


    @FXML
    private Label Algorithimlabel2;


    @FXML
    private ChoiceBox<String> mychoicebox2;


    @FXML
    private Label Algorithimlabel3;


    @FXML
    private ChoiceBox<String> mychoicebox3;


    private String[] algos = {"Merge Sort", "Insertion Sort",  "Bubble sort"};




    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        mychoicebox1.getItems().addAll(algos);
        mychoicebox2.getItems().addAll(algos);
        mychoicebox3.getItems().addAll(algos);


    }
}
