package bot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.facilities.TelegramHttpClientBuilder;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.nio.channels.Channels;

public class Main {
    public static void main(String[] args) {
        // Initialize Api Context
        System.out.println("Initialisation...");
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        System.out.println("TelegramBotsApi...");
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        System.out.println("RegisterBot...");
        try {
            botsApi.registerBot(new JCBot24());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Waiting for New messages in GCN channel...");




    }
}
