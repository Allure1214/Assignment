module com.anthony.assignment {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.anthony.assignment to javafx.fxml;
    exports com.anthony.assignment;
}