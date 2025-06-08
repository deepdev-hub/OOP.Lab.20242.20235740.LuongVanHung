module hust.soict.hedspi.aims {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens hust.soict.hedspi.aims.screen.customer.controller;

    opens hust.soict.hedspi.aims to javafx.fxml;
    exports hust.soict.hedspi.aims;
}
