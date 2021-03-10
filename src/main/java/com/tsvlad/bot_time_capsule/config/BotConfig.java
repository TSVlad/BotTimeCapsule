package com.tsvlad.bot_time_capsule.config;

import com.tsvlad.bot_time_capsule.Bot;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {
    private String username;
    private String token;
    private String path;

    @Bean
    public Bot bot() {
        Bot bot = new Bot();
        bot.setUsername(username);
        bot.setToken(token);
        bot.setPath(path);

        return bot;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
