module mx.arturogil.proyectopoou2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.arturogil.proyectopoou2 to javafx.fxml;
    exports mx.arturogil.proyectopoou2;
}