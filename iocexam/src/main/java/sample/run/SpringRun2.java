package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Game;
import sample.config.GameConfig;

public class SpringRun2 {
    public static void main(String[] args) {
        ApplicationContext context 
        = new AnnotationConfigApplicationContext(GameConfig.class);

        Game game = context.getBean( Game.class);
        game.play();
    }
}
