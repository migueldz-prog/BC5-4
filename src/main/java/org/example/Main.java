package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        HBox hbox = new HBox(button1, button2);//hbox organiza horizontalmente

        Button button3 = new Button("Botón 3");
        VBox vbox = new VBox(hbox, button3);//vbox organiza verticalmente

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Eje 4 - HBox y VBox");
        primaryStage.setScene(scene);
        primaryStage.show();//se crea la escena, se pone titutlo, se asigna a la ventana y se hace visible
    }

    public static void main(String[] args) { launch(args); }
} //metodo de la clase application para arrancar el programa

