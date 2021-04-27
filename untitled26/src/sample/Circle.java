package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.RED);
        gr.fillOval(50, 50, 100, 100);
    }
}
