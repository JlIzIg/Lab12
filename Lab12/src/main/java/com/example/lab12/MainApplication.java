package com.example.lab12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression
    public static void main(String[] args) { //NOPMD - suppressed CommentRequired - TODO explain reason for suppression
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("animals-view.fxml")); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        Scene scene = new Scene(fxmlLoader.load(), 900, 600); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        stage.setTitle("nimals");
        stage.setScene(scene);
        stage.setResizable(false);
        // stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResource("images/animal.bmp")).toExternalForm())); //NOPMD - suppressed CommentSize - TODO explain reason for suppression
        stage.show();
    }
}