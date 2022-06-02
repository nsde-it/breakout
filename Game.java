//Import
import basis.*;
import java.awt.*;

public class Game {
    //Deklaration
    private Fenster window;
    private Leinwand canvas;
    private Knopf exitBtn;
    private Ball ball;
    private Slider slider;
    
    public Game() {
        window = new Fenster("Project FreakOut™", 600, 500);
        window.setzeHintergrundFarbe(Farbe.rgb(0, 50, 0));
        
        canvas = new Leinwand(20, 20, 560, 390);
        canvas.setzeHintergrundFarbe(Farbe.rgb(0, 100, 0));
        canvas.setzeRand(Farbe.rgb(0, 250, 0), 4);
        
        exitBtn = new Knopf("[exit]", 450, 430, 130, 50);
        exitBtn.setzeSchriftFarbe(Farbe.rgb(0, 250, 0));
        exitBtn.setzeHintergrundFarbe(Farbe.rgb(0, 100, 0));
        exitBtn.setzeSchriftGroesse(20);
        exitBtn.setzeRand(Farbe.rgb(0, 250, 0), 4);
        
        ball = new Ball(canvas);
        slider = new Slider(canvas);
        slider.init(ball);
        
        run();
    }


    public void run() {
        while (!exitBtn.wurdeGedrueckt()) {
            Hilfe.pause(16);
            ball.move();
            slider.move();
            //if (!ball.didLose()) {               
            //    ball.move();
            //}
        }
        window.gibFrei();
    } //führeAus


}
