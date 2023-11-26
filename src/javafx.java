//package com.example.demo1;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.Insets;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//import javax.swing.*;
//import java.io.IOException;
//
//public class javafx extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        Label l1 = new Label("CURRENT CITY");
//        TextField f1 = new TextField();
//        Label l2 = new Label("BANK NAME");
//        TextField f2 = new TextField();
//        Button B1=new Button("Search");
//        B1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                BorderPane root1 = new BorderPane();
//                TableView tb = new TableView<application.Person>();
//                TableColumn BranchName = new TableColumn<application.Person,String>("BRANCH NAME");
//                TableColumn Address = new TableColumn<application.Person,String>("ADDRESS");
//
//                tb.getColumns().add(BranchName);
//                tb.getColumns().add(Address);
//
//                root1.setCenter(tb);
//
//                Scene scene1 = new Scene(root1, 500 ,300);
//                Stage stage2 = new Stage();
//                stage2.setTitle("Table view demo");
//                stage2.setScene(scene1);
//                stage2.show();
//            }
//        });
//        GridPane root = new GridPane();
//        root.setHgap(10);
//        root.setVgap(10);
//        root.addColumn(0,l1);
//        root.addRow(1,f1);
//        root.addRow(2,l2);
//        root.addRow(3,f2);
//        root.add(B1,0,4,6,2);
//        root.setPadding(new Insets(30,30,30,30));
//        Scene s1 = new Scene(root);
//        s1.getStylesheets().add("scene1.css");
//        B1.getStyleClass().add("b1");
//        stage.setScene(s1);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}