package sample.config;

import java.util.List;

import org.springframework.context.annotation.Bean;

import sample.Dice;
import sample.Game;
import sample.Player;

public class GameConfig {
    @Bean
    public Dice dice(){
        return new Dice(6);
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
