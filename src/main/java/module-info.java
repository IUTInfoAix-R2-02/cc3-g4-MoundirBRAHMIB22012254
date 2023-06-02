module tp.bindings {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens fr.amu.iut.cc3 to javafx.fxml;
    exports fr.amu.iut.cc3;
}
