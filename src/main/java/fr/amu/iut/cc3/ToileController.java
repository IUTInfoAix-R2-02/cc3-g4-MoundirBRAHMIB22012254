package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private TextField fieldC1;

    @FXML
    private TextField fieldC2;

    @FXML
    private TextField fieldC3;

    @FXML
    private TextField fieldC4;

    @FXML
    private TextField fieldC5;

    @FXML
    private TextField fieldC6;

    @FXML
    private Button tracer;

    @FXML
    private Button vider;








    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }



    @FXML
    private void addData() {

        int ValeurC1 = 0;
        int ValeurC2 = 0;
        int ValeurC3 = 0;
        int ValeurC4 = 0;
        int ValeurC5 = 0;
        int ValeurC6 = 0;

        int C1X = 0;
        int C2X = 0;
        int C3X = 0;
        int C4X = 0;
        int C5X = 0;
        int C6X = 0;

        int C1Y = 0;
        int C2Y = 0;
        int C3Y = 0;
        int C4Y = 0;
        int C5Y = 0;
        int C6Y = 0;

        Circle rond = new Circle();

        if (!fieldC1.getText().isEmpty()) {
            ValeurC1 = Integer.parseInt(fieldC1.getText());
            C1X = getXRadarChart(ValeurC1, 1);
            C1Y = getYRadarChart(ValeurC1, 1);
            setCircle(rond, C1X, C1Y, 50);
        }
        if (!fieldC2.getText().isEmpty()) {
            ValeurC2 = Integer.parseInt(fieldC2.getText());
            C2X = getXRadarChart(ValeurC2, 2);
            C2Y = getYRadarChart(ValeurC2, 2);
            setCircle(rond, C2X, C2Y, 50);
        }
        if (!fieldC3.getText().isEmpty()) {
            ValeurC3 = Integer.parseInt(fieldC3.getText());
            C3X = getXRadarChart(ValeurC3, 3);
            C3Y = getYRadarChart(ValeurC3, 3);
            setCircle(rond, C3X, C3Y, 50);
        }
        if (!fieldC4.getText().isEmpty()) {
            ValeurC4 = Integer.parseInt(fieldC4.getText());
            C4X = getXRadarChart(ValeurC4, 4);
            C4Y = getYRadarChart(ValeurC4, 4);
            setCircle(rond, C4X, C4Y, 50);
        }
        if (!fieldC5.getText().isEmpty()) {
            ValeurC5 = Integer.parseInt(fieldC5.getText());
            C5X = getXRadarChart(ValeurC5, 5);
            C5Y = getYRadarChart(ValeurC5, 5);
            setCircle(rond, C5X, C5Y, 50);
        }
        if (!fieldC6.getText().isEmpty()) {
            ValeurC6 = Integer.parseInt(fieldC6.getText());
            C6X = getXRadarChart(ValeurC6, 6);
            C6Y = getYRadarChart(ValeurC6, 6);
            setCircle(rond, C6X, C6Y, 50);
        }




    }

    void setCircle(Circle cercle, int Xradar, int Yradar, int radius) {
        cercle.setCenterX(Xradar);
        cercle.setCenterY(Yradar);
        cercle.setRadius(radius);
    }


    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

}
