package brian.com.config;

import brian.com.GuessCount;
import brian.com.MaxNumber;
import brian.com.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "brian.com")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == FIELDS ==
    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:5}")
    private int minNumber;

    // ==BEAN METHODS==
    @Bean
    @MaxNumber
    public int MaxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int getMinNumber(){
        return minNumber;
    }
}
