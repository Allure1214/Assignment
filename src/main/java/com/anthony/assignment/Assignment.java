package com.anthony.assignment;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class Assignment extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        Image image = new Image(Assignment.class.getResource("star_rail.jpg").toString());
        ImageView imageView = new ImageView(image);
        borderPane.getChildren().add(imageView);
        imageView.setFitHeight(800);
        imageView.setFitWidth(1550);

        borderPane.setTop(GameMenu());
        borderPane.setCenter(background());

        Scene scene = new Scene(borderPane, 1100, 635);
        stage.setTitle("Honkai: Star Rail");
        stage.setScene(scene);
        stage.show();

    }

        public HBox GameMenu(){

            HBox gameTitle = new HBox();

            Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 27);
            Text gameName = new Text("Honkai: Star Rail");
            gameName.setFont(font);
            gameName.setFill(Color.DARKSLATEBLUE);
            gameTitle.getChildren().addAll(gameName);
            gameTitle.setPadding(new Insets(3,220,0,0));

            MenuBar menuBar = new MenuBar();
            Menu menuMenu = new Menu("Menu");
            Menu menuDocs = new Menu("Docs");
            Menu menuWhitePaper = new Menu("Whitepaper");
            menuBar.getMenus().addAll(menuMenu, menuDocs, menuWhitePaper);
            menuBar.setStyle("-fx-background-color: rgba(288,288,288,0);");
            menuBar.setPadding(new Insets(5,0,0,0));

            HBox Icons = new HBox();
            Image image1 = new Image(Assignment.class.getResource("facebook_Icon.jpeg").toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setFitHeight(30); imageView1.setFitWidth(30);
            Button Facebook = new Button("", imageView1);
            Facebook.setStyle("-fx-background-color: rgba(0,0,0,0)");

            Image image2 = new Image(Assignment.class.getResource("twitter_icon.png").toString());
            ImageView imageView2 = new ImageView(image2);
            imageView2.setFitHeight(30); imageView2.setFitWidth(30);
            Button Twitter = new Button("", imageView2);
            Twitter.setStyle("-fx-background-color: rgba(0,0,0,0)");

            Image image3 = new Image(Assignment.class.getResource("hoyolab_icon.jpeg").toString());
            ImageView imageView3 = new ImageView(image3);
            imageView3.setFitHeight(30); imageView3.setFitWidth(30);
            Button Hoyolab = new Button("", imageView3);
            Hoyolab.setStyle("-fx-background-color: rgba(0,0,0,0)");

            Image image4 = new Image(Assignment.class.getResource("discord_icon.png").toString());
            ImageView imageView4 = new ImageView(image4);
            imageView4.setFitHeight(30); imageView4.setFitWidth(30);
            Button Discord = new Button("", imageView4);
            Discord.setStyle("-fx-background-color: rgba(0,0,0,0)");

            Icons.getChildren().addAll(Facebook, Twitter, Hoyolab, Discord);
            Icons.setPadding(new Insets(0,0,0,300));

            HBox topMenu = new HBox(gameTitle, menuBar, Icons);
            topMenu.setStyle("-fx-background-color: rgba(288,288,288,0.5);");
            topMenu.setAlignment(Pos.TOP_CENTER);


        return topMenu;

    }
    public VBox background(){

        VBox inform = new VBox();
        Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 35);
        Text gameText = new Text("THE NEW TRAVEL WILL");
        final Effect glow3 = new Glow(1);
        gameText.setEffect(glow3);
        gameText.setFont(font); gameText.setFill(Color.MIDNIGHTBLUE);
        gameText.setWrappingWidth(960);
        gameText.setTextAlignment(TextAlignment.RIGHT);

        Font font1 = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 35);
        Text gameText1 = new Text("MAKE A LEGEND");
        final Effect glow1 = new Glow(1);
        gameText1.setEffect(glow1);
        gameText1.setFont(font1); gameText1.setFill(Color.DARKGOLDENROD);
        gameText1.setWrappingWidth(930);
        gameText1.setTextAlignment(TextAlignment.RIGHT);

        Font font2 = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 25);
        Text gameText2 = new Text("Write Own Legends and World Future");
        final Effect glow2 = new Glow(1);
        gameText2.setEffect(glow2);
        gameText2.setFont(font2); gameText2.setFill(Color.DARKSLATEBLUE);
        gameText2.setWrappingWidth(960);
        gameText2.setTextAlignment(TextAlignment.RIGHT);

        Button playGame = new Button("Play Game");
        Font font3 = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30);
        final Effect glow = new Glow(1);
        playGame.setEffect(glow);
        playGame.setFont(font3);
        playGame.setStyle("-fx-background-color: rgba(0,0,0,0); -fx-text-fill: #C3FFEF;");
        playGame.setMaxWidth(500);
        playGame.setMaxHeight(500);
        playGame.setPadding(new Insets(120,0,0,120));

        inform.getChildren().addAll(gameText, gameText1, gameText2, playGame);
        inform.setSpacing(5);

        return inform;
    }
    public static void main(String[] args) {
        launch();
    }
}