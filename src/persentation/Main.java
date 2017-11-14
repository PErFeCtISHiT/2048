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
    Scene init;
    game gam;
    Scene gamescene;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        stage.setTitle("2048");
        label = new Label("have fun");
        start = new Button();
        start.setText("开始");
        start.setPrefSize(150,100);
        start.setOnAction(e -> f());
        quit = new Button();
        quit.setText("退出");
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
        init = new Scene(grid,1000,800);
        init.getStylesheets().add("css.css");
        stage.setScene(init);
        stage.show();
    }

    private void f() {
        gam = new game();
        GridPane g = new GridPane();
        g.setPadding(new Insets(10,10,10,10));
        g.setVgap(8);
        g.setHgap(10);
        Label label[][] = new Label[4][4];
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                label[i][j] = new Label(gam.get(i,j));
                label[i][j].setPrefSize(150,150);
                GridPane.setConstraints(label[i][j],i,j);
                g.getChildren().add(label[i][j]);
            }
        }
        Label score = new Label("得分");
        Label con = new Label();
        GridPane.setConstraints(score,5,0);
        GridPane.setConstraints(con,5,1);
        Button ret = new Button("返回");
        GridPane.setConstraints(ret,5,2);
        ret.setOnAction(e -> stage.setScene(init));
        Button exit = new Button("退出");
        GridPane.setConstraints(exit,5,3);
        exit.setOnAction(e -> stage.close());
        g.getChildren().addAll(score,con,ret,exit);
        gamescene = new Scene(g,1000,800);
        gamescene.getStylesheets().add("css.css");
        stage.setScene(gamescene);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
