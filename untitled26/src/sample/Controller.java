package sample;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.shape.ArcType;
public class Controller {

    @FXML
    Canvas canvas;
    @FXML
    TextField textField;

    public void run(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        if (textField.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        } else {
            int numberOfSides = Integer.parseInt(textField.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides);
            gr.clearRect(0, 0, 250, 485);
            shape1.draw(gr);
        }
    }

    public void clear(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0,0,1000,1000);
    }
}
