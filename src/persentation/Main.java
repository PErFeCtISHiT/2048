package persentation;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import logic.game;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


public class Main extends Application {
    Label label;
    Stage stage;
    Button start;
    Button quit;
    Image image;
    game g = new game();
    Scene gamescene;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        stage.setTitle("2048");
        label = new Label("have fun");
        start = new Button();
        start.setText("begin your game");
        start.setPrefSize(150,100);
        start.setOnAction(e -> stage.setScene(gamescene));
        quit = new Button();
        quit.setText("quit");
        quit.setPrefSize(150,100);
        quit.setOnAction(e -> stage.close());
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(100, 300, 100, 400));
        grid.setVgap(8);
        grid.setHgap(10);
        GridPane.setConstraints(label,0,0);
        GridPane.setConstraints(start,0,1);
        GridPane.setConstraints(quit,0,2);
        grid.getChildren().addAll(label,start,quit);
        Scene init = new Scene(grid,1000,800);
        GridPane g = new GridPane();
        g.setPadding(new Insets(10,10,10,10));
        g.setVgap(8);
        g.setHgap(10);
        Label label[][] = new Label[4][4];
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                label[i][j] = new Label("i");
                label[i][j].setPrefSize(150,150);
                GridPane.setConstraints(label[i][j],i,j);
                g.getChildren().add(label[i][j]);
            }
        }
        gamescene = new Scene(g,1000,800);
        init.getStylesheets().add("css.css");
        gamescene.getStylesheets().add("css.css");
        stage.setScene(init);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
