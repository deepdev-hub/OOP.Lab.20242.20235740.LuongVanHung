package hust.soict.hedspi.aims.screen.customer.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import hust.soict.hedspi.aims.media.CD;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

public class testController implements Initializable{
    @FXML
    private Button btn;
    @FXML
    private TextField textField;
    // @FXML
    // private Label resultLabel ;
    // @FXML
    // private Label name;
    // @FXML
    // private Label cost;
    // @FXML
    // private Button btnAddToCart;
    // @FXML
    // private Button btnPlay;
    // @FXML
    // private ScrollPane scrollPane;
    @FXML
    private FlowPane flowPane;
    @FXML
    // private AnchorPane anchorPane;
    // @FXML

    public void handleClick(){
        // resultLabel.setText("hello " + textField.getText());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        List<CD> cdList = new ArrayList<>();

        cdList.add(new CD(1, "Greatest Hits 1", "Pop", "John Smith", 45, 12.5f));
        cdList.add(new CD(2, "Love Songs 2", "Rock", "Alice Brown", 50, 15.0f));
        cdList.add(new CD(3, "Rock Legends 3", "Rock", "David Lee", 60, 20.0f));
        cdList.add(new CD(4, "Jazz Classics 4", "Jazz", "Maria Garcia", 40, 10.0f));
        cdList.add(new CD(5, "Pop Essentials 5", "Pop", "Tom Wilson", 35, 8.0f));
        cdList.add(new CD(6, "Greatest Hits 6", "Classical", "John Smith", 70, 18.5f));
        cdList.add(new CD(7, "Love Songs 7", "Hip-Hop", "Alice Brown", 55, 13.0f));
        cdList.add(new CD(8, "Rock Legends 8", "Rock", "David Lee", 65, 22.0f));
        cdList.add(new CD(9, "Jazz Classics 9", "Jazz", "Maria Garcia", 48, 11.5f));
        cdList.add(new CD(10, "Pop Essentials 10", "Pop", "Tom Wilson", 38, 9.0f));

        System.out.println(".()");
        System.out.println(".()");
        System.out.println(".()");
        for (CD cd : cdList) {
            try {
                System.out.println(".()");
                System.out.println(".()");
                System.out.println(".()"+ getClass().getResource("/hust/soict/hedspi/aims/product.fxml"));
                FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("/hust/soict/hedspi/aims/product.fxml"));
                AnchorPane productAnchorPane = fXMLLoader.load();

                flowPane.getChildren().add(productAnchorPane);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
