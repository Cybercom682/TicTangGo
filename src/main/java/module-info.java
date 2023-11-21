module com.projects.tictanggo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.projects.tictanggo to javafx.fxml;
    exports com.projects.tictanggo;
}