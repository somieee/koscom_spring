package sample.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import sample.Dice;
import sample.Game;
import sample.Player;

@PropertySource({"classpath:application.properties"})
public class GameConfig {
    @Bean
    public Dice dice(@Value("${face}")int face){
        return new Dice(face);
    }

    @Bean
    public Player kang(Dice dice){
        Player p = new Player(dice, "강경미");
        // p.setName("강경미");
        // p.setDice(dice);
        return p;
    }
    @Bean
    public Player kim(Dice dice){
        Player p = new Player();
        p.setName("김길동");
        p.setDice(dice);
        return p;
    }
    @Bean
    public Player hong(Dice dice){
        Player p = new Player();
        p.setName("홍길동");
        p.setDice(dice);
        return p;
    }

    @Bean
    public Game game(List<Player> list){
         Game game = new Game();
         game.setPlayerList(list);
         return game;
    }
}
